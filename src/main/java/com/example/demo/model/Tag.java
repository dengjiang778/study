package com.example.demo.model;

import java.util.Date;
import java.util.List;

/**
 *
 */
//@Entity
//@Table(name = "t_tag")
public class Tag {
    private static final long serialVersionUID = 1L;

    public Tag() {
    }

    public Tag(Long id) {
        this.id = id;
    }

    /**
     * Id
     */
//    @Id
//    @GeneratedValue
//    @Column(name = "id")
    private Long id;
    /**
     * 标签名
     */
//    @Column(name = "name")
    private String name;
    /**
     * enums标签类型 1.用户标签 2.文章/视频标签
     */
//    @Column(name = "type")
    private Integer type;
    /**
     * 父级id
     */
//    @Column(name = "parent_id")
    private Long parent;
    /**
     * 标签内容
     */
//    @Column(name = "description")
    private String description;
    /**
     * 创建时间
     */
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//    @Column(name = "created")
    private Date created;
    /**
     * 更新时间
     */
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//    @Column(name = "updated")
    private Date updated;
    /**
     * 删除
     */
//    @Column(name = "deleted")
    private Boolean deleted;

    //    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)
    private List<Tag> sonTagList;
    // fields end

    /**
     * Id
     */
    public Long getId() {
        return id;
    }

    /**
     * Id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 标签名
     */
    public String getName() {
        return name;
    }

    /**
     * 标签名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * enums标签类型 1.用户标签 2.文章/视频标签
     */
    public Integer getType() {
        return type;
    }

    /**
     * enums标签类型 1.用户标签 2.文章/视频标签
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 父级id
     */
    public Long getParent() {
        return parent;
    }

    /**
     * 父级id
     */
    public void setParent(Long parent) {
        this.parent = parent;
    }

    /**
     * 标签内容
     */
    public String getDescription() {
        return description;
    }

    /**
     * 标签内容
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 创建时间
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 创建时间
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 更新时间
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 更新时间
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * 删除
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * 删除
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public List<Tag> getSonTagList() {
        return sonTagList;
    }

    public void setSonTagList(List<Tag> sonTagList) {
        this.sonTagList = sonTagList;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", parent=" + parent +
                ", description='" + description + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                ", deleted=" + deleted +
                '}';
    }
}
