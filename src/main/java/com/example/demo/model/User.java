package com.example.demo.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Transient;
import java.util.Collection;
import java.util.Date;

/**
 * User
 */
public class User implements UserDetails {
    private static final long serialVersionUID = 1L;

    public User() {
    }

    public User(Long id) {
        this.id = id;
    }

    /**
     * id
     */
    private Long id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 用户类型
     */
    private Integer type;

    private Boolean deleted;

    private String headImage;

    private String mobile;

    /**
     * 性别，1男，2女，0未知，对应Gender枚举
     */
    private Integer gender;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date created;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updated;

    /**
     * 上次登陆失败时间
     */
    private Date lastLoginFailTime;

    /**
     * 今天登陆失败次数
     */
    private int todayLoginFailCount = 0;

    /**
     * 是否被禁止登陆
     */
    private boolean forbidden;

    /**
     * 禁止登陆开始时间
     */
    private Date forbidStartTime;

    /**
     * 禁止登陆结束时间
     */
    private Date forbidEndTime;

    /**
     * 上次登陆成功时间
     */
    private Date lastLoginSuccessTime;

    /**
     * 上次登陆成功ip
     */
    private String lastLoginSuccessIp;

    /**
     * 上次登陆失败ip
     */
    private String lastLoginFailIp;

    /**
     * wxOPenId
     */
    private String openId;
    /**
     * height
     */
    private Integer height;
    /**
     * weight
     */
    private Integer weight;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    /**
     * 职业
     */
    private String profession;

    private String address;

    private String token;

    @Transient
    private Collection<? extends GrantedAuthority> authorities;

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public boolean isAccountNonExpired() {
        return true;
    }

    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Date getLastLoginFailTime() {
        return lastLoginFailTime;
    }

    public void setLastLoginFailTime(Date lastLoginFailTime) {
        this.lastLoginFailTime = lastLoginFailTime;
    }

    public int getTodayLoginFailCount() {
        return todayLoginFailCount;
    }

    public void setTodayLoginFailCount(int todayLoginFailCount) {
        this.todayLoginFailCount = todayLoginFailCount;
    }

    public boolean isForbidden() {
        return forbidden;
    }

    public void setForbidden(boolean forbidden) {
        this.forbidden = forbidden;
    }

    public Date getForbidStartTime() {
        return forbidStartTime;
    }

    public void setForbidStartTime(Date forbidStartTime) {
        this.forbidStartTime = forbidStartTime;
    }

    public Date getForbidEndTime() {
        return forbidEndTime;
    }

    public void setForbidEndTime(Date forbidEndTime) {
        this.forbidEndTime = forbidEndTime;
    }

    public Date getLastLoginSuccessTime() {
        return lastLoginSuccessTime;
    }

    public void setLastLoginSuccessTime(Date lastLoginSuccessTime) {
        this.lastLoginSuccessTime = lastLoginSuccessTime;
    }

    public String getLastLoginSuccessIp() {
        return lastLoginSuccessIp;
    }

    public void setLastLoginSuccessIp(String lastLoginSuccessIp) {
        this.lastLoginSuccessIp = lastLoginSuccessIp;
    }

    public String getLastLoginFailIp() {
        return lastLoginFailIp;
    }

    public void setLastLoginFailIp(String lastLoginFailIp) {
        this.lastLoginFailIp = lastLoginFailIp;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + '}';
    }
}
