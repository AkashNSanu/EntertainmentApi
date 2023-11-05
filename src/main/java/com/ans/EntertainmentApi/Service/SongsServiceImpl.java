package com.ans.EntertainmentApi.Service;

import com.ans.EntertainmentApi.Entity.Songs;
import com.ans.EntertainmentApi.dao.SongsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongsServiceImpl implements SongsService{

    private SongsRepository songsRepository;

    @Autowired
    public SongsServiceImpl(SongsRepository songsRepository) {
        this.songsRepository = songsRepository;
    }

    @Override
    public List<Songs> findAll() {
        return songsRepository.findAll();
    }

    @Override
    public Songs findById(int songId) {
        Optional<Songs> result = songsRepository.findById(songId);
        Songs theSong = null;
        if(result.isPresent()){
            theSong = result.get();
        }
        else {
            throw new RuntimeException("Did not find Song id - "+songId);
        }
        return theSong;
    }

    @Override
    public Songs save(Songs theSong) {
        Songs songs = songsRepository.save(theSong);
        return songs;
    }

    @Override
    public void deleteById(int songId) {
        songsRepository.deleteById(songId);
    }
}
