package org.example;

import java.util.List;
import java.util.stream.Collectors;
import javafx.scene.Scene;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

public class ViewController {
    public void sortAlphabetically(){
        Movie movie = new Movie();
        List<Movie> movieList = movie.initializeMovies();
       /* for(List<Movie> listOfMovies : movieList){
            List<String> movieList =
            List<String> sortedList = movieList.stream().sorted().collect(Collectors.toList());
        }*/
    }
}
