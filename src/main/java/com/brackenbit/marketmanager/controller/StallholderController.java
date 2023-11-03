/*
 * Market Manager
 * (C) Brackenbit 2023
 */

package com.brackenbit.marketmanager.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brackenbit.marketmanager.service.StallholderService;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/stallholders")
public class StallholderController {

    private StallholderService stallholderService;

    public StallholderController(StallholderService stallholderService) {
        this.stallholderService = stallholderService;
    }

}
