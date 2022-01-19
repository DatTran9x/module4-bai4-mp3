package main.service;

import main.model.Genre;
import main.repository.GenreRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreService implements IGenreService{
    @Autowired
    GenreRep genreRepo;

    @Override
    public List<Genre> findAll() {
        return (List<Genre>) genreRepo.findAll();
    }
}
