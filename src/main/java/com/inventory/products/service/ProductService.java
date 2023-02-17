package com.inventory.products.service;

import com.inventory.products.dto.ProductsDTO;
import com.inventory.products.model.Colors;
import com.inventory.products.model.Products;
import com.inventory.products.model.Sizes;
import com.inventory.products.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductsRepository productsRepository;

    public List<ProductsDTO> innerJoinData() {
        return productsRepository.fetchDataInnerJoin();
    }

    public Products getProduct(int product_id){
        return productsRepository.findByProductId(product_id);
    }

    public boolean saveProducts(Products products, int color, int size) {

        Colors color1 = productsRepository.findByColor_Id(color);
        Sizes sizes = productsRepository.findBySize_Id(size);
        products.setColor(color1);
        products.setSize(sizes);
        productsRepository.save(products);
        return true;
    }
}
