package com.example.netflixui;

import com.example.netflixui.Model.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
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


        // update a movie
        //Movies updatedMovie = new Movies("Avengers","Chris Evans",null,null,null);
        //updatedMovie = feignRestClient.update((long)8, updatedMovie);
        //System.out.println("Updated Movie"+updatedMovie.toString());

        //Delete a movie
        //feignRestClient.delete(movies1);

        //search movie by name
//        List<Movies> moviesList = feignRestClient.searchByName("Terminator");
//        System.out.println(moviesList);



        //Register a user
        //Users users1= new Users(2146,"Sharon Kirigo");
        //users1=feignRestClient.createUser(users1);
        //System.out.println("Created User :"+users1.toString());

        //List all users
        List<Users> users = feignRestClient.getAllUsers();
        System.out.println("Users created"+users.toString());

        List<Types> types = feignRestClient.getAllTypes();
        System.out.println(types);


        List<Categories> categories = feignRestClient.getAllCategories();
        System.out.println(categories);

         ArrayList cats = new ArrayList();
         cats.add(2L);
         cats.add(1L);

       // Create a movie
         Movies movies1 = new Movies("Test Movie","Test Actor ", types.get(0),users.get(0));
         Movies created =feignRestClient.createMovie( movies1, users.get(0).getIdNumber(), cats);
         System.out.println("Movie created"+created.toString());

        //List of movies
        List<Movies> movies=feignRestClient.getAllMovies();
        System.out.println("Movies:" +movies.toString());

        //Get a user by idno
        //Users thisUser = feignRestClient.findById((long) 10);
        //System.out.println("Searched user" +thisUser.toString());









    }
}
