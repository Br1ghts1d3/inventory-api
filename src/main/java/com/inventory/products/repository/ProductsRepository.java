package com.inventory.products.repository;

import com.inventory.products.dto.ProductsDTO;
import com.inventory.products.model.Colors;
import com.inventory.products.model.Products;
import com.inventory.products.model.Sizes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer> {

    @Query(value = "SELECT new com.inventory.products.dto.ProductsDTO(p.name, c.name, s.size, p.cost, p.totalUnit,p.price) "
            + "FROM Products p, Colors c, Sizes s where p.color.id = c.id and p.size.id = s.id")
    List<ProductsDTO> fetchDataInnerJoin();
    Products findByProductId(int product_id);

    @Query(value = "Select c From Colors c WHERE c.id = ?1")
    Colors findByColor_Id(int color_id);

    @Query(value = "Select s From Sizes s WHERE s.id = ?1")
    Sizes findBySize_Id(int size_id);
}
