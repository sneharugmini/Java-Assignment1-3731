package com.example.javaweek02;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import main.java.com.example.javaassignment13731.SceneChanger;

import javax.swing.text.TableView;

public class SpotifyTableController implements Initializable {

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){

    }

    @FXML
    void addNewBook_onClick(ActionEvent event) {
        SceneChanger.changeScenes(event, "create-spotify-view.fxml","Spotify!");
    }

    @FXML
    void viewChart_onClick(ActionEvent event) {

    }

}

