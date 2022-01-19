package main.service;

import main.model.Song;
import main.repository.SongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService implements ISongService{
    @Autowired
    SongRepo songRepo;

    @Override
    public List<Song> findAll() {
        return (List<Song>) songRepo.findAll();
    }

    @Override
    public void save(Song song) {
        songRepo.save(song);
    }
}
