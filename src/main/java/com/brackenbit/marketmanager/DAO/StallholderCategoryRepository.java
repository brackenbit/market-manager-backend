/*
 * Market Manager
 * (C) Brackenbit 2023
 */

package com.brackenbit.marketmanager.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brackenbit.marketmanager.entity.StallholderCategory;

@Repository
public interface StallholderCategoryRepository extends JpaRepository<StallholderCategory, Long> {

    List<StallholderCategory> findAllByOrderByNameAsc();

}
