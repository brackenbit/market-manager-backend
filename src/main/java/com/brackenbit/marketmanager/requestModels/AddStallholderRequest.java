/*
 * Market Manager
 * (C) Brackenbit 2023
 */

package com.brackenbit.marketmanager.requestModels;

import lombok.Data;

@Data
public class AddStallholderRequest {

    private String name;
    private String category;
    private String contactName;
    private String preferredName;
    private String phone;
    private String email;
    private boolean regular;
    private int stallSize;
    private String characteristics;

}
