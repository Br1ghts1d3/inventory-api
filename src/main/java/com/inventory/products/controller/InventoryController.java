package com.inventory.products.controller;


import com.inventory.products.model.Colors;
import com.inventory.products.model.Products;
import com.inventory.products.model.Sales;
import com.inventory.products.repository.SalesRepository;
import com.inventory.products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private SalesRepository salesRepository;


    @Autowired
    ProductService productService;
    @PostMapping("/sale/{id}")
    public ResponseEntity<String> saveSale(@RequestBody Sales sales, @PathVariable int id) {

        Products products = productService.getProduct(id);
        int total = products.getTotalUnit();
        products.setTotalUnit(total - sales.getTotalUnits());
        salesRepository.save(sales);
        return new ResponseEntity<String>("listo",HttpStatus.OK);
    }

    @PostMapping("/products/{cid}/{sid}")
    public ResponseEntity<Boolean> saveProduct(@RequestBody Products products, @PathVariable int cid, @PathVariable int sid){
        return new ResponseEntity<Boolean>(productService.saveProducts(products, cid, sid), HttpStatus.OK);
    }
}
