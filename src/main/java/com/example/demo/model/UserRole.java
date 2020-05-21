package com.example.demo.model;

/**
 * @date 2012-9-9
 */
public class UserRole {
    public UserRole() {
    }

    public UserRole(Long id) {
        this.id = id;
    }

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long userId;
    private Long roleId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

}
