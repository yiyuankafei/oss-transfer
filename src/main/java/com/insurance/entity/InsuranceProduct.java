package com.insurance.entity;

import java.math.BigDecimal;
import java.util.Date;

public class InsuranceProduct {
    /**
     * 商品id
     */
    private Integer id;

    /**
     * 渠道id
     */
    private Integer channelId;

    /**
     * 分类id,对应insurance_category表的主键
     */
    private Integer categoryId;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品副标题
     */
    private String subtitle;

    /**
     * 商品简介
     */
    private String detail;

    /**
     * 产品主图,url相对地址
     */
    private String mainImage;

    /**
     * 价格,单位-元保留两位小数
     */
    private BigDecimal price;

    /**
     * 购买链接
     */
    private String buyUrl;

    /**
     * 测评链接
     */
    private String evaluateUrl;

    /**
     * banner链接
     */
    private String bannerUrl;

    /**
     * banner是否推荐
     */
    private Boolean bannerIsRecom;

    /**
     * 
     */
    private Boolean isTop;

    /**
     * 商品状态.1-在售 2-下架 4-删除
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 图片地址(默认第一个为主图)
     */
    private String subImages;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage == null ? null : mainImage.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getBuyUrl() {
        return buyUrl;
    }

    public void setBuyUrl(String buyUrl) {
        this.buyUrl = buyUrl == null ? null : buyUrl.trim();
    }

    public String getEvaluateUrl() {
        return evaluateUrl;
    }

    public void setEvaluateUrl(String evaluateUrl) {
        this.evaluateUrl = evaluateUrl == null ? null : evaluateUrl.trim();
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl == null ? null : bannerUrl.trim();
    }

    public Boolean getBannerIsRecom() {
        return bannerIsRecom;
    }

    public void setBannerIsRecom(Boolean bannerIsRecom) {
        this.bannerIsRecom = bannerIsRecom;
    }

    public Boolean getIsTop() {
        return isTop;
    }

    public void setIsTop(Boolean isTop) {
        this.isTop = isTop;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getSubImages() {
        return subImages;
    }

    public void setSubImages(String subImages) {
        this.subImages = subImages == null ? null : subImages.trim();
    }
}