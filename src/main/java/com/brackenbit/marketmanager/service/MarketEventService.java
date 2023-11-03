/*
 * Market Manager
 * (C) Brackenbit 2023
 */

package com.brackenbit.marketmanager.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brackenbit.marketmanager.DAO.MarketEventRepository;
import com.brackenbit.marketmanager.entity.MarketEvent;

@Service
@Transactional
public class MarketEventService {

    private MarketEventRepository marketEventRepository;

    @Autowired
    public MarketEventService(MarketEventRepository marketEventRepository) {
        this.marketEventRepository = marketEventRepository;
    }

    public List<MarketEvent> getMarketEvents(String start, String end) throws Exception {
        LocalDate startDate;
        LocalDate endDate;

        try {
            // Front end should pass string "yyy-MM-dd" that can be parsed
            startDate = LocalDate.parse(start);
            endDate = LocalDate.parse(end);
        } catch (Exception e) {
            throw e;
        }

        return marketEventRepository.findAllByStartBetween(startDate, endDate);
    }

}
