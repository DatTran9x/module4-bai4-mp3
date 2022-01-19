package main.repository;

import main.model.Genre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRep extends CrudRepository<Genre,Integer> {
}
