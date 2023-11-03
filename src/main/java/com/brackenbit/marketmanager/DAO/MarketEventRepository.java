/*
 * Market Manager
 * (C) Brackenbit 2023
 */

package com.brackenbit.marketmanager.DAO;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brackenbit.marketmanager.entity.MarketEvent;

public interface MarketEventRepository extends JpaRepository<MarketEvent, Long> {

    List<MarketEvent> findAllByStartBetween(LocalDate startRangeStart, LocalDate startRangeEnd);

}
