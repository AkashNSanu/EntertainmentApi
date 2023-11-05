package com.ans.EntertainmentApi.dao;

import com.ans.EntertainmentApi.Entity.Series;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeriesRepository extends JpaRepository<Series, Integer> {

}
