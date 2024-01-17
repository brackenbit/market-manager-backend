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
import java.util.Optional;

public interface StallholderRepository extends JpaRepository<Stallholder, Long> {

    // findAllByOrderByNameAsc is the "default GET" for this repo
    // Default findAll returns sorted by id, which is no good.
    Page<Stallholder> findAllByOrderByStallNameAsc(Pageable pageable);

    Optional<Stallholder> findByStallName(String stallName);

    Page<Stallholder> findByStallNameContaining(@RequestParam("stallName") String stallName, Pageable pageable);

    Page<Stallholder> findByCategory(@RequestParam("category") String category, Pageable pageable);

    Page<Stallholder> findByStallNameContainingAndCategory(@RequestParam("stallName") String stallName,
            @RequestParam("category") String category, Pageable pageable);

}
