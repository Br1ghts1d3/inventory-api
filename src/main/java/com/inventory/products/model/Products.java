package com.inventory.products.model;
import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Products {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", nullable = false, unique = true)
    private Long productId;

    @Basic
    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Basic
    @Column(name = "cost", nullable = false, precision = 0, unique = true)
    private float cost;
    @Basic
    @Column(name = "total_unit", nullable = false, unique = true)
    private int totalUnit;
    @Basic
    @Column(name = "price", nullable = false, precision = 0, unique = true)
    private float price;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "color_id", nullable = false)
    private Colors color;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "size_id", nullable = false)
    private Sizes size;

    public Sizes getSize() {
        return size;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }


    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getTotalUnit() {
        return totalUnit;
    }

    public void setTotalUnit(int totalUnit) {
        this.totalUnit = totalUnit;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
