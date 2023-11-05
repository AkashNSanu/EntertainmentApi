package com.ans.EntertainmentApi.Service;

import com.ans.EntertainmentApi.Entity.Series;
import com.ans.EntertainmentApi.dao.SeriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SeriesServiceImpl implements SeriesService{

    private SeriesRepository seriesRepository;

    @Autowired
    public SeriesServiceImpl(SeriesRepository seriesRepository){
        this.seriesRepository = seriesRepository;
    }

    @Override
    public List<Series> findAll() {
        return seriesRepository.findAll();
    }

    @Override
    public Series findById(int seriesId) {
        Optional<Series> result = seriesRepository.findById(seriesId);
        Series theSeries = null;
        if(result.isPresent()){
            theSeries = result.get();
        }
        else {
            throw new RuntimeException("Did not find Series id - "+seriesId);
        }
        return theSeries;
    }

    @Override
    public Series save(Series theSeries) {
        Series series = seriesRepository.save(theSeries);
        return series;
    }

    @Override
    public void deleteById(int seriesId) {
        seriesRepository.deleteById(seriesId);
    }
}
