package main.java.com.example.javaassignment13731;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLOutput;

public class CreateSpotifyController implements Initializable {

    @FXML
    private TextField artistTextField;

    @FXML
    private Label finalLabel;

    @FXML
    private TextField streamTextField;

    @FXML
    private TextField trackNameTextField;

    @FXML
    private TextField yearTextField;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("I am in the initialize function");

        //hide finalLabel
        finalLabel.setVisible(false);


    }

    @FXML
    void saveBook(ActionEvent event) {
        System.out.println("Button Clicked");

        //show finalLabel
        finalLabel.setVisible(true);

        try {
            //store user data in variables
            String trackName = trackNameTextField.getText();
            String artist = artistTextField.getText();
            int year = Integer.parseInt(yearTextField.getText());
            double streams = Double.parseDouble(streamTextField.getText());

            //initialize spotify object to pass to constructor
            Spotify spotify = new Spotify(1, trackName, artist, year, streams);

            // adding song data to database
            int generatedSongId = DBUtility.insertSongToDB(spotify);
            finalLabel.setText("Song with id: " + generatedSongId + "added.");
        } catch (Exception e){
            finalLabel.setText(e.getMessage());
        }

    }


}

