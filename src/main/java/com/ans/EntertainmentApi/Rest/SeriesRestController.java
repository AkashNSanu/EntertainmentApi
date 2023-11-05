package com.ans.EntertainmentApi.Rest;

import com.ans.EntertainmentApi.Entity.Series;
import com.ans.EntertainmentApi.Service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/EntertainmentApi")
public class SeriesRestController {

    private SeriesService seriesService;

    @Autowired
    public SeriesRestController(SeriesService seriesService) {
        this.seriesService = seriesService;
    }

    @GetMapping("/series")
    public List<Series> getAllSeries(){
        List<Series> theSeries = seriesService.findAll();
        return theSeries;
    }

    @GetMapping("/series/{seriesId}")
    public Series getSeriesById(@PathVariable int seriesId){
        Series theSeries = seriesService.findById(seriesId);
        return theSeries;
    }

    @PostMapping("/series")
    public Series addTheNewSeries(@RequestBody Series theSeries){
        theSeries.setId(0);
        Series dbSeries = seriesService.save(theSeries);
        return dbSeries;
    }

    @PutMapping("/series")
    public Series updateTheSeriesInfo(@RequestBody Series theSeries){
        Series dbSeries = seriesService.save(theSeries);
        return dbSeries;
    }

    @DeleteMapping("/series/{seriesId}")
    public String deleteSeriesById(@PathVariable int seriesId){
        Series theSeries = seriesService.findById(seriesId);
        if(theSeries == null){
            throw new RuntimeException("Did not find Series id - "+seriesId);
        }
        seriesService.deleteById(seriesId);
        return "Deleted Series with Id - "+seriesId;
    }
}
