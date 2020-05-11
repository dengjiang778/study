package com.example.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 教学视频
 */
@Entity
@Table(name = "t_teaching")
public class Teaching {
    private static final long serialVersionUID = 1L;

    public Teaching() {
    }

    public Teaching(Long id) {
        this.id = id;
    }

    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    /**
     * 标题
     */
    @Column(name = "title")
    private String title;
    /**
     * 来源 1官方 2外部
     */
    @Column(name = "source")
    private Integer source;
    /**
     * 内容
     */
    @Column(name = "content")
    private String content;
    /**
     * 排序
     */
    @Column(name = "seq")
    private Integer seq;
    /**
     * 发布状态 1已发布 0未发布
     */
    @Column(name = "status")
    private Integer status;
    /**
     * 视频url
     */
    @Column(name = "video_url")
    private String videoUrl;
    /**
     * 视频时长
     */
    @Column(name = "video_duration")
    private String videoDuration;
    /**
     * 封面图片
     */
    @Column(name = "cover_image")
    private String coverImage;
    /**
     * 阅读数初始值
     */
    @Column(name = "base_watch")
    private Integer baseWatch;
    /**
     * 阅读数
     */
    @Column(name = "watch")
    private Integer watch;
    /**
     * 点赞人数初始值
     */
    @Column(name = "base_support")
    private Integer baseSupport;
    /**
     * 点赞数
     */
    @Column(name = "support")
    private Integer support;
    /**
     * 收藏初始值
     */
    @Column(name = "base_collect")
    private Integer baseCollect;
    /**
     * 收藏
     */
    @Column(name = "collect")
    private Integer collect;
    /**
     * 评论数
     */
    @Column(name = "comment")
    private Integer comment;
    /**
     * 1.文章2.视频
     */
    @Column(name = "type")
    private Integer type;
    /**
     * 外部链接(unuse)
     */
    @Column(name = "external_link")
    private String externalLink;
    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "updated")
    private Date updated;
    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "created")
    private Date created;
    /**
     * 是否已删除
     */
    @Column(name = "deleted")
    private Boolean deleted;
    /**
     * enums标签类型 1.教学 2.大神推荐
     */
    @Column(name = "category")
    private Integer category;
    /**
     * 推荐人
     */
    @Column(name = "referrer")
    private String referrer;
    /**
     * 来源 来源于什么网站
     */
    @Column(name = "origin")
    private String origin;
    // fields end

    /**
     * id
     */
    public Long getId() {
        return id;
    }

    /**
     * id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 来源 1官方 2外部
     */
    public Integer getSource() {
        return source;
    }

    /**
     * 来源 1官方 2外部
     */
    public void setSource(Integer source) {
        this.source = source;
    }

    /**
     * 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 排序
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * 排序
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * 发布状态 1已发布 0未发布
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 发布状态 1已发布 0未发布
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 视频url
     */
    public String getVideoUrl() {
        return videoUrl;
    }

    /**
     * 视频url
     */
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    /**
     * 视频时长
     */
    public String getVideoDuration() {
        return videoDuration;
    }

    /**
     * 视频时长
     */
    public void setVideoDuration(String videoDuration) {
        this.videoDuration = videoDuration;
    }

    /**
     * 封面图片
     */
    public String getCoverImage() {
        return coverImage;
    }

    /**
     * 封面图片
     */
    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    /**
     * 阅读数初始值
     */
    public Integer getBaseWatch() {
        return baseWatch;
    }

    /**
     * 阅读数初始值
     */
    public void setBaseWatch(Integer baseWatch) {
        this.baseWatch = baseWatch;
    }

    /**
     * 阅读数
     */
    public Integer getWatch() {
        return watch;
    }

    /**
     * 阅读数
     */
    public void setWatch(Integer watch) {
        this.watch = watch;
    }

    /**
     * 点赞人数初始值
     */
    public Integer getBaseSupport() {
        return baseSupport;
    }

    /**
     * 点赞人数初始值
     */
    public void setBaseSupport(Integer baseSupport) {
        this.baseSupport = baseSupport;
    }

    /**
     * 点赞数
     */
    public Integer getSupport() {
        return support;
    }

    /**
     * 点赞数
     */
    public void setSupport(Integer support) {
        this.support = support;
    }

    /**
     * 收藏初始值
     */
    public Integer getBaseCollect() {
        return baseCollect;
    }

    /**
     * 收藏初始值
     */
    public void setBaseCollect(Integer baseCollect) {
        this.baseCollect = baseCollect;
    }

    /**
     * 收藏
     */
    public Integer getCollect() {
        return collect;
    }

    /**
     * 收藏
     */
    public void setCollect(Integer collect) {
        this.collect = collect;
    }

    /**
     * 评论数
     */
    public Integer getComment() {
        return comment;
    }

    /**
     * 评论数
     */
    public void setComment(Integer comment) {
        this.comment = comment;
    }

    /**
     * 1.文章2.视频
     */
    public Integer getType() {
        return type;
    }

    /**
     * 1.文章2.视频
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 外部链接(unuse)
     */
    public String getExternalLink() {
        return externalLink;
    }

    /**
     * 外部链接(unuse)
     */
    public void setExternalLink(String externalLink) {
        this.externalLink = externalLink;
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
     * 是否已删除
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * 是否已删除
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getReferrer() {
        return referrer;
    }

    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
