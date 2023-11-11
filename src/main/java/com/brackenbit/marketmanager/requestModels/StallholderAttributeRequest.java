/*
 * Market Manager
 * (C) Brackenbit 2023
 * 
 * StallholderAttributeRequest
 * Has corresponding attributes for all StallholderModel attributes except for id.
 * Used to pass stallholder attributes for add/edit requests.
 */

package com.brackenbit.marketmanager.requestModels;

import lombok.Data;

@Data
public class StallholderAttributeRequest {

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
