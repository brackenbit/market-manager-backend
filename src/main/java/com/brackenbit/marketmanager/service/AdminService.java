/*
 * Market Manager
 * (C) Brackenbit 2023
 * 
 * AdminService
 * NB: provides all admin services, including some relating to entities that have their own services.
 * e.g. Adding a new stallholder is supported here, not in StallholderService
 */

package com.brackenbit.marketmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brackenbit.marketmanager.DAO.StallholderRepository;
import com.brackenbit.marketmanager.entity.Stallholder;
import com.brackenbit.marketmanager.requestModels.AddStallholderRequest;

@Service
@Transactional
public class AdminService {

    private StallholderRepository stallholderRepository;

    @Autowired
    public AdminService(StallholderRepository stallholderRepository) {
        this.stallholderRepository = stallholderRepository;
    }

    public void addStallholder(AddStallholderRequest addStallholderRequest) {
        Stallholder stallholder = new Stallholder();
        stallholder.setName(addStallholderRequest.getName());
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
}
