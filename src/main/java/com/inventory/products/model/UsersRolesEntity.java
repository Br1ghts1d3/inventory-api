package com.inventory.products.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "users_roles", schema = "inventory", catalog = "")
public class UsersRolesEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "user_id", nullable = false)
    private long userId;
    @Basic
    @Column(name = "role_id", nullable = false)
    private long roleId;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }
}
