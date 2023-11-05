package com.ans.EntertainmentApi.Rest;

import com.ans.EntertainmentApi.Entity.Songs;
import com.ans.EntertainmentApi.Service.SongsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/EntertainmentApi")
public class SongsRestController {

    private SongsService songsService;

    @Autowired
    public SongsRestController(SongsService songsService) {
        this.songsService = songsService;
    }

    @GetMapping("/songs")
    public List<Songs> getAllSongs(){
        List<Songs> theSongs = songsService.findAll();
        return theSongs;
    }

    @GetMapping("/songs/{songId}")
    public Songs getSongById(@PathVariable int songId){
        Songs theSong = songsService.findById(songId);
        return theSong;
    }

    @PostMapping("/songs")
    public Songs addTheNewSong(@RequestBody Songs theSong){
        theSong.setId(0);
        Songs dbSongs = songsService.save(theSong);
        return dbSongs;
    }

    @PutMapping("/songs")
    public Songs updateTheSongInfo(@RequestBody Songs theSong){
        Songs dbSongs = songsService.save(theSong);
        return dbSongs;
    }

    @DeleteMapping("/songs/{songId}")
    public String deleteTheSongById(@PathVariable int songId){
        Songs theSong = songsService.findById(songId);
        if(theSong == null){
            throw new RuntimeException("Did not find Song id - "+songId);
        }
        songsService.deleteById(songId);
        return "Deleted Song with Id - "+songId;
    }
}
