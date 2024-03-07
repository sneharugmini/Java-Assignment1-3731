module com.example.javaassignment13731 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.javaassignment13731 to javafx.fxml;
    exports com.example.javaassignment13731;
}