package com.inventory.products.model;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name = "sizes")
public class Sizes implements Serializable {

    @Id
    @Column(name = "id", unique = true)
    private int id;
    @Column(name = "size", unique = true)
    private int size;
    @Column(name = "description", unique = true)
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Sizes{" +
                "id=" + id +
                ", size=" + size +
                ", description='" + description + '\'' +
                '}';
    }
}
