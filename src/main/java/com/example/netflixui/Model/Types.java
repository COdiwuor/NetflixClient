package com.example.netflixui.Model;

public class Types {
    private long id;
    private String typeName;

    public Types(String typeName) {
        this.typeName = typeName;
    }

    public Types() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "Types{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
