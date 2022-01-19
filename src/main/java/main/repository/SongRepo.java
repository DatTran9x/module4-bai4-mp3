package main.repository;

import main.model.Song;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepo extends CrudRepository<Song,Integer> {
}
