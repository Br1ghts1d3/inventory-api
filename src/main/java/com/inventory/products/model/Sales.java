package com.inventory.products.model;

import jakarta.persistence.*;

@Entity
@Table(name = "sales", schema = "inventory")
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "product_name", nullable = false, length = 100)
    private String productName;

    @Column(name = "product_color", nullable = false, length = 100)
    private String productColor;

    @Column(name = "size", nullable = false)
    private Float size;

    @Column(name = "unit_price")
    private Float unitPrice;

    @Column(name = "total_units", nullable = false)
    private Integer totalUnits;

    @Column(name = "total_cost", nullable = false)
    private Float totalCost;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public Float getSize() {
        return size;
    }

    public void setSize(Float size) {
        this.size = size;
    }

    public Float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getTotalUnits() {
        return totalUnits;
    }

    public void setTotalUnits(Integer totalUnits) {
        this.totalUnits = totalUnits;
    }

    public Float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Float totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productColor='" + productColor + '\'' +
                ", size=" + size +
                ", unitPrice=" + unitPrice +
                ", totalUnits=" + totalUnits +
                ", totalCost=" + totalCost +
                '}';
    }
}