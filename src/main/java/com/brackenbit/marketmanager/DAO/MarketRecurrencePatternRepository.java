/*
 * Market Manager
 * (C) Brackenbit 2023
 */

package com.brackenbit.marketmanager.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brackenbit.marketmanager.entity.MarketRecurrencePattern;

public interface MarketRecurrencePatternRepository extends JpaRepository<MarketRecurrencePattern, Long> {

}
