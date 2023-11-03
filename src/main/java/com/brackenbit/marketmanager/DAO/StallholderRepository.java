/*
 * Market Manager
 * (C) Brackenbit 2023
 */

package com.brackenbit.marketmanager.DAO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import com.brackenbit.marketmanager.entity.Stallholder;

public interface StallholderRepository extends JpaRepository<Stallholder, Long> {

    // findAllByOrderByNameAsc is the "default GET" for this repo
    // Default findAll returns sorted by id, which is no good.
    Page<Stallholder> findAllByOrderByNameAsc(Pageable pageable);

    Page<Stallholder> findByNameContaining(@RequestParam("name") String name, Pageable pageable);

    Page<Stallholder> findByCategory(@RequestParam("category") String category, Pageable pageable);

    Page<Stallholder> findByNameContainingAndCategory(@RequestParam("name") String name,
            @RequestParam("category") String category, Pageable pageable);

}
