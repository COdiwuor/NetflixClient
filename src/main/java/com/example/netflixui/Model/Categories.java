package com.example.netflixui.Model;

public class Categories {
    private long id;
    private String categoryName;

    public Categories(String categoryName) {
        this.categoryName = categoryName;
    }

    public Categories() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}

