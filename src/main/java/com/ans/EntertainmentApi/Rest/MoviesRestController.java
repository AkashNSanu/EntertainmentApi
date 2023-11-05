package com.ans.EntertainmentApi.Rest;

import com.ans.EntertainmentApi.Entity.Movies;
import com.ans.EntertainmentApi.Service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/EntertainmentApi")
public class MoviesRestController {

    private MoviesService moviesService;

    @Autowired
    public MoviesRestController(MoviesService moviesService){
        this.moviesService = moviesService;
    }

    @GetMapping("")
    public String info(){
        return "hello";
    }

    @GetMapping("/movies")
    public List<Movies> getAllMovies(){
        List<Movies> theMovies = moviesService.findAll();
        return theMovies;
    }

    @GetMapping("/movies/{movieId}")
    public Movies getMovieById(@PathVariable int movieId){
        Movies theMovie = moviesService.findById(movieId);
        return theMovie;
    }

    @PostMapping("/movies")
    public Movies addTheNewMovie(@RequestBody Movies theMovie){
        theMovie.setId(0);
        Movies dbMovie = moviesService.save(theMovie);
        return dbMovie;
    }

    @PutMapping("/movies")
    public  Movies updateTheMovieInfo(@RequestBody Movies theMovie){
        Movies dbMovie = moviesService.save(theMovie);
        return dbMovie;
    }

    @DeleteMapping("/movies/{movieId}")
    public String deleteMovieById(@PathVariable int movieId){
        Movies theMovie = moviesService.findById(movieId);
        if(theMovie == null){
            throw new RuntimeException("Did not find Movie id - "+movieId);
        }
        moviesService.deleteById(movieId);
        return "Deleted Movie with Id - "+movieId;
    }

}
