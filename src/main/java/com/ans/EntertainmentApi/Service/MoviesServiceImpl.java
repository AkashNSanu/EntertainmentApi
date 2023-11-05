package com.ans.EntertainmentApi.Service;

import com.ans.EntertainmentApi.Entity.Movies;
import com.ans.EntertainmentApi.dao.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MoviesServiceImpl implements MoviesService{

    private MoviesRepository moviesRepository;

    @Autowired
    public MoviesServiceImpl(MoviesRepository moviesRepository){
        this.moviesRepository = moviesRepository;
    }

    @Override
    public List<Movies> findAll() {
        return moviesRepository.findAll();
    }

    @Override
    public Movies findById(int movieId) {
        Optional<Movies> result = moviesRepository.findById(movieId);
        Movies theMovies = null;
        if(result.isPresent()){
            theMovies = result.get();
        }
        else {
            throw new RuntimeException("Did not find Movie id - "+movieId);
        }
        return theMovies;
    }

    @Override
    public Movies save(Movies theMovie) {
        Movies movies = moviesRepository.save(theMovie);
        return movies;
    }

    @Override
    public void deleteById(int movieId) {
        moviesRepository.deleteById(movieId);
    }
}
