package main.service;

import main.model.Song;

import java.util.List;

public interface ISongService {
    List<Song> findAll();
    void save(Song song);
}
