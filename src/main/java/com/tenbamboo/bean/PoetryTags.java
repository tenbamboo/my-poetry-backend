package com.tenbamboo.bean;

public class PoetryTags {
    private String tagsId;

    private String tagsName;

    private String tagsType;

    private String createDate;

    private Integer userId;

    private String baseId;

    public String getTagsId() {
        return tagsId;
    }

    public void setTagsId(String tagsId) {
        this.tagsId = tagsId == null ? null : tagsId.trim();
    }

    public String getTagsName() {
        return tagsName;
    }

    public void setTagsName(String tagsName) {
        this.tagsName = tagsName == null ? null : tagsName.trim();
    }

    public String getTagsType() {
        return tagsType;
    }

    public void setTagsType(String tagsType) {
        this.tagsType = tagsType == null ? null : tagsType.trim();
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getBaseId() {
        return baseId;
    }

    public void setBaseId(String baseId) {
        this.baseId = baseId == null ? null : baseId.trim();
    }
}