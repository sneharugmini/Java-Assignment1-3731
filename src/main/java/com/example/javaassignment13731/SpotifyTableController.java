package com.example.javaweek02;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;

import javax.swing.text.TableView;

public class SpotifyTableController {

    @FXML
    private TableColumn<Spotify, String> artistColumn;

    @FXML
    private TableColumn<Spotify, Integer> songIdColumn;

    @FXML
    private TableColumn<Spotify, Double> streamColumn;

    @FXML
    private TableColumn<Spotify, String> trackNameColumn;

    @FXML
    private TableColumn<Spotify, Integer> yearColumn;

    @FXML
    private TableView<Spotify> tableView;

    @FXML
    void addNewBook_onClick(ActionEvent event) {

    }

    @FXML
    void viewChart_onClick(ActionEvent event) {

    }

}

