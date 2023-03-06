package org.example;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


import java.util.ArrayList;
import java.util.Arrays;

import static javafx.application.Application.launch;

public class App extends Application{

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("test");
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch();
        Movie test = new Movie();

        test.initializeMovies();
        System.out.println("test:" + test.initializeMovies().get(0).title + test.initializeMovies().get(0).description + test.initializeMovies().get(1).genres);
    }


}