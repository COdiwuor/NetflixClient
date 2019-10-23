package com.example.netflixui;


import com.example.netflixui.Model.Categories;
import com.example.netflixui.Model.Movies;
import com.example.netflixui.Model.Types;
import com.example.netflixui.Model.Users;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "client", url = "https://springbootapi.herokuapp.com", configuration = FeignConfig.class)
public interface FeignRestClient {

    // Endpoints for movie

    //Listing all movies
    @RequestMapping(method = RequestMethod.GET,value = "movies")
    List<Movies> getAllMovies();

    //creating a movie
    @RequestMapping(method = RequestMethod.POST,value = "movies")
    Movies createMovie(@RequestParam(value ="idno") long idno, @RequestBody Movies movies);

    //updating a movie
    @RequestMapping(method = RequestMethod.PATCH, value = "movies")
    Movies update(@RequestParam("idno") Long idno , @RequestBody Movies movies);

    //Deleting a movie
    @RequestMapping(method = RequestMethod.DELETE,value = "movies")
    Movies delete(@PathVariable(name = "id") Long id,@RequestParam(name = "idno")Integer idno);

    //Search by name
    @RequestMapping(method = RequestMethod.GET, value = "movies/search")
    List<Movies> searchByName(@RequestParam(value = "name")String name);

    //Get movies by id
    @RequestMapping(method = RequestMethod.GET, value = "movies/{idno}")
    Movies findByid(@PathVariable(name = "idno") Long idno);


    //Endpoints of users
    //list all the users
    @RequestMapping(method = RequestMethod.GET,value = "users")
    List<Users> getAllUsers();

    //Get a user by Idno
    @RequestMapping(method = RequestMethod.GET, value = "users/{id}")
    Users findById(@PathVariable(name = "id")Long id);

    //Register a user
    @RequestMapping(method = RequestMethod.POST, value = "users")
    Users createUser(@RequestBody Users users);

    //Endpoints for Categories
    //List Categories
    @RequestMapping(method = RequestMethod.GET,value = "categories")
    List<Categories>getAllCategories();

    //Get a unique category
//    @RequestMapping(method = RequestMethod.GET, value = "categories/{id}")
//    Categories findById(@PathVariable(name = "idno") Long categoryid);


    //Endpoints for types
    //List types
    @RequestMapping (method = RequestMethod.GET, value = "types")
    List<Types>getAllTypes();

    //Get unique type
//    @RequestMapping(method = RequestMethod.GET, value = "types/{id}")
//    Categories findById(@PathVariable(name = "idno") Long typeid);




}
