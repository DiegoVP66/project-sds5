package com.devsuperior.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsvendas.entities.Sale;

// access to seller data
public interface SaleRepository extends JpaRepository<Sale, Long> {

}
