package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.List;

/**
 * 权限
 */
public class Authority {
    public Authority() {
    }

    public Authority(Long id) {
        this.id = id;
    }

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Long id;
    /**
     * 中文名称，如“系统管理”，“系统管理.菜单管理”之类的
     */
    private String name;
    /**
     * 英文code，如"system", "system.menu"之类的
     */
    private String code;

    private Authority parentAuthority;

    private List<Authority> childrens;

    private String module;

    private boolean contains;

    /**
     * 1就是查看类型的，2就是普通的
     */
    private Integer type;

    private Menu menu;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the parentAuthority
     */
    public Authority getParentAuthority() {
        return parentAuthority;
    }

    /**
     * @param parentAuthority the parentAuthority to set
     */
    public void setParentAuthority(Authority parentAuthority) {
        this.parentAuthority = parentAuthority;
    }

    /**
     * @return the children
     */
    public List<Authority> getChildrens() {
        return childrens;
    }

    /**
     * @param children the children to set
     */
    public void setChildrens(List<Authority> childrens) {
        this.childrens = childrens;
    }

    /**
     * @return the simpleName
     */
    public String getSimpleName() {
        if (name == null) {
            return null;
        } else {
            String[] arr = name.split("\\.");
            return arr[arr.length - 1];
        }
    }

    /**
     * @param simpleName the simpleName to set
     */
    public void setSimpleName(String simpleName) {
        // this.simpleName = simpleName;
    }

    /**
     * @return the contains
     */
    public boolean isContains() {
        return contains;
    }

    /**
     * @param contains the contains to set
     */
    public void setContains(boolean contains) {
        this.contains = contains;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

}
