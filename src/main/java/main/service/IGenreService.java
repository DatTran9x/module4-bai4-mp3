package main.service;

import main.model.Genre;

import java.util.List;

public interface IGenreService {
    List<Genre> findAll();
}
