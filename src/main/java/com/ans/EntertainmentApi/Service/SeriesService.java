package com.ans.EntertainmentApi.Service;

import com.ans.EntertainmentApi.Entity.Series;

import java.util.List;

public interface SeriesService {
    List<Series> findAll();

    Series findById(int seriesId);

    Series save(Series theSeries);

    void deleteById(int seriesId);
}
