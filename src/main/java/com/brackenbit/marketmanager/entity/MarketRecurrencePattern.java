/*
 * Market Manager
 * (C) Brackenbit 2023
 */

package com.brackenbit.marketmanager.entity;

import java.time.DayOfWeek;
import java.time.LocalDate;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.brackenbit.marketmanager.DAO.DayOfWeekConverter;

import lombok.Data;

@Entity
@Table
@Data
public class MarketRecurrencePattern {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate start;

    private LocalDate end;

    // Represents day of week on which event recurs
    @Convert(converter = DayOfWeekConverter.class)
    private DayOfWeek dayOfWeek;

    // Represents whether event should recur on the 1st, 2nd, etc. occurrence
    // of the given weekday within a month
    private boolean recurWeekday1;
    private boolean recurWeekday2;
    private boolean recurWeekday3;
    private boolean recurWeekday4;
    private boolean recurWeekday5;

    // Represents whether event should recur within a particular month
    private boolean recurMonth1;
    private boolean recurMonth2;
    private boolean recurMonth3;
    private boolean recurMonth4;
    private boolean recurMonth5;
    private boolean recurMonth6;
    private boolean recurMonth7;
    private boolean recurMonth8;
    private boolean recurMonth9;
    private boolean recurMonth10;
    private boolean recurMonth11;
    private boolean recurMonth12;

}
