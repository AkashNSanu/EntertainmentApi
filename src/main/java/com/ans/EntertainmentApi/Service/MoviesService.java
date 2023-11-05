package com.ans.EntertainmentApi.Service;

import com.ans.EntertainmentApi.Entity.Movies;

import java.util.List;

public interface MoviesService {
    List<Movies> findAll();

    Movies findById(int movieId);

    Movies save(Movies theMovie);

    void deleteById(int movieId);
}
