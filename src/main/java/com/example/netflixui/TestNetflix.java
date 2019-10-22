package com.example.netflixui;

import com.example.netflixui.Model.*;
import org.apache.catalina.User;
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

        //Create a movie
        Movies movies1 = new Movies("Terminator","Arnold", new Types("original"),new Categories("SCIFI"),new Users(3,"Cyril"));
       // movies.add(movies1);
        //feignRestClient.createMovie((long) 3, movies1);
        // System.err.println("========>>>"+movies1.toString());

        // update a movie
        //feignRestClient.update((long) 3,movies1);

        //Delete a movie
        //feignRestClient.delete(movies1);

        //search movie by name
        List<Movies> moviesList = feignRestClient.searchByName("Expandables");
        System.out.println(moviesList);

        //Register a user
        Users users1= new Users(2144,"Cyril Owuor");
        users1=feignRestClient.createUser(users1);
        System.out.println("Created User :"+users1.toString());

        //List all users
        List<Users> users = feignRestClient.getAllUsers();
        System.out.println("Users created"+users.toString());





    }
}
