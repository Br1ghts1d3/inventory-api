package com.inventory.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@EnableConfigurationProperties
@EntityScan(basePackages = {"com.inventory.products.model"})
@SpringBootApplication
public class InventoryApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryApiApplication.class, args);
    }

}
