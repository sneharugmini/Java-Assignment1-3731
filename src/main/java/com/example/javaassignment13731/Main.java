package com.example.javaassignment13731;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(com.example.javaassignment13731.Main.class.getResource("create-spotify-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Spotify!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}