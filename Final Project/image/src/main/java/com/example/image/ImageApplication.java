package com.example.image;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class ImageApplication extends Application {

//    The ImageApplication class： is a JavaFX Application that starts and initializes
//    the Image Editor user interface.

    @Override
    public void start(Stage stage) throws IOException {

    //        This method is called when the application is launched. It initializes the
    //        primary stage and sets up the user interface using an FXML file.
    //        Stage： The primary stage for this application.
    //        Throws IOException： If an I/O error occurs while loading the FXML file.

        // Load the FXML file for the user interface using FXMLLoader
        FXMLLoader fxmlLoader = new FXMLLoader(ImageApplication.class.getResource("hello-view.fxml"));

        // Create a new Scene with the loaded user interface
        Scene scene = new Scene(fxmlLoader.load(), 750, 550);

        // Set the title, scene, and display the primary stage
        stage.setTitle("Image Editor");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

    //        The main method： launches the JavaFX application.
    //        args： Command-line arguments (not used in this application).

        launch();
    }
}
