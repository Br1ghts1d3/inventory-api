package com.inventory.products.dto;

public class ProductsDTO {

    private String name;
    private String colorName;
    private int size;
    private float cost;
    private int totalUnits;
    private float price;

    public ProductsDTO( String name, String colorName, int size, float cost, int totalUnits, float price) {

        this.name = name;
        this.colorName = colorName;
        this.size = size;
        this.cost = cost;
        this.totalUnits = totalUnits;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getTotalUnits() {
        return totalUnits;
    }

    public void setTotalUnits(int totalUnits) {
        this.totalUnits = totalUnits;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductsDTO{" +
                "name='" + name + '\'' +
                ", colorName='" + colorName + '\'' +
                ", size=" + size +
                ", cost=" + cost +
                ", totalUnits=" + totalUnits +
                ", price=" + price +
                '}';
    }
}
