package com.ans.EntertainmentApi.dao;

import com.ans.EntertainmentApi.Entity.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepository extends JpaRepository<Movies, Integer> {
}

