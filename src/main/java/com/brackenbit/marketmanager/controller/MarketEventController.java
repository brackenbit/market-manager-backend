/*
 * Market Manager
 * (C) Brackenbit 2023
 */

package com.brackenbit.marketmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.brackenbit.marketmanager.entity.MarketEvent;
import com.brackenbit.marketmanager.service.MarketEventService;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/markets")
public class MarketEventController {

    private MarketEventService marketEventService;

    @Autowired
    public MarketEventController(MarketEventService marketEventService) {
        this.marketEventService = marketEventService;
    }

    // Provide MarketEvent feed to be consumed by fullcalendar component in front end
    @GetMapping("/feed")
    public List<MarketEvent> eventFeed(@RequestParam String start, @RequestParam String end) throws Exception {
        return marketEventService.getMarketEvents(start, end);

    }

}
