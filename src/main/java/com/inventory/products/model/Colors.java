package com.inventory.products.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "colors")
public class Colors implements Serializable {


    @Id
    @Column(name = "id", unique = true)
    private int id;
    @Column(name = "name", unique = true)
    private String name;
    @Column(name = "description", unique = true)
    private String description;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Colors{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
