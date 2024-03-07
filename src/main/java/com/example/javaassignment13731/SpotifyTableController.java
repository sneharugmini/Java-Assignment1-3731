package com.example.javaweek02;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;

import javax.swing.text.TableView;

public class SpotifyTableController {

    @FXML
    private TableColumn<?, ?> artistColumn;

    @FXML
    private TableColumn<?, ?> songIdColumn;

    @FXML
    private TableColumn<?, ?> streamColumn;

    @FXML
    private TableColumn<?, ?> trackNameColumn;

    @FXML
    private TableColumn<?, ?> yearColumn;

    @FXML
    private TableView<Spotify> tableView;

    @FXML
    void addNewBook_onClick(ActionEvent event) {

    }

    @FXML
    void viewChart_onClick(ActionEvent event) {

    }

}

