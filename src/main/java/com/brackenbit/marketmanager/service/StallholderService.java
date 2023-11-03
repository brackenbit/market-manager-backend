/*
 * Market Manager
 * (C) Brackenbit 2023
 */

package com.brackenbit.marketmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brackenbit.marketmanager.DAO.StallholderRepository;

@Service
@Transactional
public class StallholderService {

    private StallholderRepository stallholderRepository;

    @Autowired
    public StallholderService(StallholderRepository stallholderRepository) {
        this.stallholderRepository = stallholderRepository;
    }

}
