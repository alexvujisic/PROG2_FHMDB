package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Movie test = new Movie("Creed 3", "In 2002 Los Angeles, a young Adonis \"Donnie\" Creed", new ArrayList<Genre>(Arrays.asList(Genre.ACTION, Genre.DRAMA)));

        test.initializeMovies();
        System.out.println("test:" + test.initializeMovies().get(0).title + test.initializeMovies().get(0).description + test.initializeMovies().get(1).genres);
    }

    public static int add(int i){
        return (i + 1);
    }
}