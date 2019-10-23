package com.example.netflixui;

import com.example.netflixui.Model.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Component
public class TestNetflix implements CommandLineRunner {
    private final FeignRestClient feignRestClient;

    public TestNetflix(FeignRestClient feignRestClient) {
        this.feignRestClient = feignRestClient;
    }


    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate = new RestTemplate();

        //List of movies
        List<Movies> movies=feignRestClient.getAllMovies();
        System.out.println("Movies:" +movies.toString());

        // update a movie
        //Movies updatedMovie = new Movies("Avengers","Chris Evans",null,null,null);
        //updatedMovie = feignRestClient.update((long)8, updatedMovie);
        //System.out.println("Updated Movie"+updatedMovie.toString());

        //Delete a movie
        //feignRestClient.delete(movies1);

        //search movie by name
        List<Movies> moviesList = feignRestClient.searchByName("Expandables");
        System.out.println(moviesList);

        //Register a user
        //Users users1= new Users(2146,"Sharon Kirigo");
        //users1=feignRestClient.createUser(users1);
        //System.out.println("Created User :"+users1.toString());

        //List all users
        List<Users> users = feignRestClient.getAllUsers();
        System.out.println("Users created"+users.toString());

        //Create a movie
        //Movies movies1 = new Movies("Terminator","Arnold", null,null,null);
        //movies1=feignRestClient.createMovie((long) 7, movies1);
        //System.err.println("========>>>"+movies1.toString());

        //Get a user by idno
        Users thisUser = feignRestClient.findById((long) 10);
        System.out.println("Searched user" +thisUser.toString());









    }
}
