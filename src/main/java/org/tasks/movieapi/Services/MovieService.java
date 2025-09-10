package org.tasks.movieapi.Services;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tasks.movieapi.Models.Movie;
import org.tasks.movieapi.Repositories.MovieRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovie(String Id){
        return movieRepository.findMovieByImdbId(Id);
    }
}
