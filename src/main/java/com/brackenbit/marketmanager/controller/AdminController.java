/*
 * Market Manager
 * (C) Brackenbit 2023
 */

package com.brackenbit.marketmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.brackenbit.marketmanager.requestModels.StallholderAttributeRequest;
import com.brackenbit.marketmanager.service.AdminService;
import com.brackenbit.marketmanager.utils.ExtractJWT;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/admin")
public class AdminController {

    private AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/add/stallholder")
    public void addStallholder(@RequestHeader(value = "Authorization") String token,
            @RequestBody StallholderAttributeRequest addStallholderRequest) throws Exception {
        String userType = ExtractJWT.payloadExtraction(token, "\"userType\"");
        if (userType == null || !userType.equals("admin")) {
            throw new Exception("Administration endpoint only.");
        }
        adminService.addStallholder(addStallholderRequest);
    }

    @PutMapping("/edit/stallholder")
    public void editStallholder(@RequestHeader(value = "Authorization") String token, @RequestParam long stallholderId,
            @RequestBody StallholderAttributeRequest stallholderRequest) throws Exception {
        String userType = ExtractJWT.payloadExtraction(token, "\"userType\"");
        if (userType == null || !userType.equals("admin")) {
            throw new Exception("Administration endpoint only.");
        }
        adminService.editStallholder(stallholderId, stallholderRequest);
    }

}
