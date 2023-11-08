/*
 * Market Manager
 * (C) Brackenbit 2023
 * 
 * DayOfWeekConverter
 * Attribute converter to convert Java's DayOfWeek type to/from int for persistence.
 */

package com.brackenbit.marketmanager.DAO;

import java.time.DayOfWeek;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class DayOfWeekConverter implements AttributeConverter<DayOfWeek, Integer> {

    @Override
    public Integer convertToDatabaseColumn(DayOfWeek attribute) {
        return attribute.getValue();
    }

    @Override
    public DayOfWeek convertToEntityAttribute(Integer dbData) {
        return DayOfWeek.of(dbData);
    }
}
