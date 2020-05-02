package com.example.internshipproject;

public class CourseList {
    public CourseList(String description, int imgId) {
        this.description = description;
        this.imgId = imgId;
    }

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    private int imgId;
}
