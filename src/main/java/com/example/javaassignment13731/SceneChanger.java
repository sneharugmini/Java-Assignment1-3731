package main.java.com.example.javaassignment13731;

import java.awt.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneChanger {
    // static method that changes the scene
    public static void changeScenes(ActionEvent event, String fxmlFileName, String fileTitle){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(com.example.javaassignment13731.Main.class.getResource(fxmlFileName));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setTitle(fileTitle);
            stage.setScene(scene);
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
