package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Movie {
    String title;
    String description;
    List<Genre> genres;

    public Movie(String title, String description, List<Genre> genres){
        this.title = title;
        this.description = description;
        this.genres = genres;
    }

    public List<Movie> initializeMovies(){
        List<Movie> movieList = new ArrayList<>();
        List<Genre> test1 = new ArrayList<Genre>(Arrays.asList(Genre.ACTION));
        Movie creed3 = new Movie("Creed 3", "In 2002 Los Angeles, a young Adonis \"Donnie\" Creed", new ArrayList<Genre>(Arrays.asList(Genre.ACTION, Genre.DRAMA)));
        movieList.add(creed3);
        Movie pussInBoots2 = new Movie("Puss in boots 2", "Cat in boots blablabla", new ArrayList<Genre>(Arrays.asList(Genre.ANIMATION, Genre.ADVENTURE)));
        movieList.add(pussInBoots2);
        return movieList;
    }
}
