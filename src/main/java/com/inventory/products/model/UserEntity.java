package com.inventory.products.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "user", schema = "inventory", catalog = "")
public class UserEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;
    @Basic
    @Column(name = "email", nullable = true, length = 255)
    private String email;
    @Basic
    @Column(name = "first_name", nullable = true, length = 255)
    private String firstName;
    @Basic
    @Column(name = "last_name", nullable = true, length = 255)
    private String lastName;
    @Basic
    @Column(name = "password", nullable = true, length = 255)
    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
