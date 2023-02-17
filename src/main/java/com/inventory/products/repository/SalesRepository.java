package com.inventory.products.repository;

import com.inventory.products.model.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<Sales, Integer> {
}
