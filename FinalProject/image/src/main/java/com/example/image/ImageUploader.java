package com.example.image;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.TilePane;
import javafx.stage.FileChooser;
import java.io.File;
import java.util.List;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.collections.FXCollections;
import javafx.application.Platform;

public class ImageUploader {

//    The ImageUploader class is a JavaFX controller that allows the user to upload
//    images, view their metadata, and convert them to different formats.

    @FXML
    private Button uploadButton;

    @FXML
    private TilePane imagePane;

    @FXML
    private ChoiceBox<String> formatChoiceBox;

    @FXML
    private Button convertButton;

    @FXML
    private ProgressBar progressBar;
    private List<File> inputFiles;

    private ImageConverter imageConverter = new ImageMagickConverter();
    private ImageDataExtractor metadataExtractor = new DrewDataExtractor();
    @FXML
    private List<ImageModel> images;

    @FXML
    public void initialize() {

    //        Initializes the JavaFX components and sets their event listeners.

        formatChoiceBox.setItems(FXCollections.observableArrayList("JPEG", "PNG", "GIF", "BMP", "TIFF"));
        formatChoiceBox.getSelectionModel().selectFirst();

        // Set up event handler for uploading images
        uploadButton.setOnAction(event -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Images", "*.png", "*.jpg", "*.jpeg", "*.gif", "*.bmp"));
            inputFiles = fileChooser.showOpenMultipleDialog(null);

            if (inputFiles != null) {
                inputFiles.forEach(this::addImageThumbnail);
            }
        });

        progressBar.setProgress(0);

        // Set up event handler for converting images
        convertButton.setOnAction(event -> {
            if (inputFiles != null && formatChoiceBox.getValue() != null) {
                imageConverter.convertImages(inputFiles, formatChoiceBox.getValue(), progress -> {
                    Platform.runLater(() -> progressBar.setProgress(progress));
                });
            }
        });
    }

    private void addImageThumbnail(File file) {

    //        Adds an image thumbnail and its metadata to the TilePane.
    //             file: The image file to be added to the TilePane.

        ImageModel imageModel = metadataExtractor.extractData(file);
        if (imageModel != null) {
            ImageView imageView = new ImageView(imageModel.getImage());
            imageView.setFitWidth(100);
            imageView.setFitHeight(100);
            //     make the size of the images preview 100*100.
            imageView.setPreserveRatio(true);
            imageView.setSmooth(true);

            Label cameraLabel = new Label("Camera: " + imageModel.getCameraModel());
            Label locationLabel = new Label("Location: " + imageModel.getLocation());
            Label dateLabel = new Label("Date: " + imageModel.getDate());
            Label sizeLabel = new Label(imageModel.getSize());
            //     display various properties of the images.

            VBox imageInfo = new VBox(imageView, cameraLabel, locationLabel, dateLabel, sizeLabel);
            imageInfo.getStyleClass().add("image-info");
            imagePane.getChildren().add(imageInfo);
        }
    }
}
