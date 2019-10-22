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

        //Create a movie
        Movies movies1 = new Movies("Terminator","Arnold", new Types("original"),new Categories("SCIFI"),new Users(3,"Cyril"));
        movies.add(movies1);

//        feignRestClient.createMovie((long) 3, movies1);
//        System.err.println("========>>>"+movies1.toString());
//
//        feignRestClient.update((long) 3,movies1);
//
//        feignRestClient.delete(movies1);

        //search by name
        List<Movies> moviesList = feignRestClient.searchByName("Expandables");
        
        System.out.println(moviesList);








    }
}
