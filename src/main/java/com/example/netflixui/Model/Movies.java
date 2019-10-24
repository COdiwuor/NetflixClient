package com.example.netflixui.Model;





import java.util.ArrayList;
import java.util.List;

public class Movies {
    private long id;
    private String name;
    private String  actor;
    private Types type;
    List<Categories> category;

    private Users user;

    public Movies(String name, String actor, Types type, Users user) {
        this.name = name;
        this.actor = actor;
        this.type = type;
        this.user = user;
    }

    public Movies() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public Types getType() {
        return type;
    }

    public void setType(Types type) {
        this.type = type;
    }

//    public List<Categories> getCategory() {
//        return category;
//    }

   // public void setCategory(List<Categories> category) {
  //      this.category = category;
   // }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user)              {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", actor='" + actor + '\'' +
                ", type=" + type +
                ", category=" + category +
                ", user=" + user +
                '}';
    }
}
