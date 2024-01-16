/*
 * Market Manager
 * (C) Brackenbit 2023
 * 
 * AdminService
 * NB: provides all admin services, including some relating to entities that have their own services.
 * e.g. Adding a new stallholder is supported here, not in StallholderService
 */

package com.brackenbit.marketmanager.service;

import java.util.Optional;

import javax.persistence.EntityExistsException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brackenbit.marketmanager.DAO.StallholderRepository;
import com.brackenbit.marketmanager.entity.Stallholder;
import com.brackenbit.marketmanager.requestModels.StallholderAttributeRequest;

@Service
@Transactional
public class AdminService {

    private StallholderRepository stallholderRepository;

    @Autowired
    public AdminService(StallholderRepository stallholderRepository) {
        this.stallholderRepository = stallholderRepository;
    }

    public void addStallholder(StallholderAttributeRequest addStallholderRequest) throws Exception {
        // While id is the primary key of stallholder, name should also be unique.
        // Throw exception if existing stallholder exists with this name.
        Optional<Stallholder> validateStallholder = stallholderRepository
                .findByStallName(addStallholderRequest.getStallName());
        if (validateStallholder.isPresent()) {
            throw new Exception("Existing stallholder with this stall name.");
        }

        Stallholder stallholder = new Stallholder();
        stallholder.setStallName(addStallholderRequest.getStallName());
        stallholder.setCategory(addStallholderRequest.getCategory());
        stallholder.setContactName(addStallholderRequest.getContactName());
        stallholder.setPreferredName(addStallholderRequest.getPreferredName());
        stallholder.setPhone(addStallholderRequest.getPhone());
        stallholder.setEmail(addStallholderRequest.getEmail());
        stallholder.setRegular(addStallholderRequest.isRegular());
        stallholder.setStallSize(addStallholderRequest.getStallSize());
        stallholder.setCharacteristics(addStallholderRequest.getCharacteristics());
        stallholderRepository.save(stallholder);
    }

    public void editStallholder(Long id, StallholderAttributeRequest stallholderRequest) throws Exception {
        // Name should be unique, so check that they're not editing this
        // stallholder to have the same name as another one.
        Optional<Stallholder> validateStallholder = stallholderRepository
                .findByStallName(stallholderRequest.getStallName());

        validateStallholder.ifPresent(theStallholder -> {
            // Throw exception if there exists a stallholder with the same name but different ID.
            if (theStallholder.getId() != id) {
                if (theStallholder.getStallName() == stallholderRequest.getStallName()) {
                    throw new EntityExistsException("Existing stallholder with this name.");
                }
            }

        });

        // Load existing stallholder (if exists)
        Optional<Stallholder> existingStallholder = stallholderRepository.findById(id);
        // If no existing stallholder with this id, throw exception
        if (!existingStallholder.isPresent()) {
            throw new Exception("Stallholder not found.");
        }

        // Update stallholder fields to match request
        existingStallholder.get().setStallName(stallholderRequest.getStallName());
        existingStallholder.get().setCategory(stallholderRequest.getCategory());
        existingStallholder.get().setContactName(stallholderRequest.getContactName());
        existingStallholder.get().setPreferredName(stallholderRequest.getPreferredName());
        existingStallholder.get().setPhone(stallholderRequest.getPhone());
        existingStallholder.get().setEmail(stallholderRequest.getEmail());
        existingStallholder.get().setRegular(stallholderRequest.isRegular());
        existingStallholder.get().setStallSize(stallholderRequest.getStallSize());
        existingStallholder.get().setCharacteristics(stallholderRequest.getCharacteristics());

        // Save updated entity to repo
        stallholderRepository.save(existingStallholder.get());

    }
}
