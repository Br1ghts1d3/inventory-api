package com.inventory.products.controller;


import com.inventory.products.dto.ProductsDTO;
import com.inventory.products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
public class MainController {


    @Autowired
    ProductService productService;

    @GetMapping("/")
    public ResponseEntity<List<ProductsDTO>> getData() {
        return new ResponseEntity<>(productService.innerJoinData(), HttpStatus.OK);
    }

}
