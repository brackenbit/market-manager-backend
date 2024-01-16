/*
 * Market Manager
 * (C) Brackenbit 2023
 */

package com.brackenbit.marketmanager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "stallholder")
@Data
public class Stallholder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String stallName;

    private String category;

    private String contactName;

    private String preferredName;

    private String phone;

    private String email;

    private boolean regular;

    private int stallSize;

    private String characteristics;
}