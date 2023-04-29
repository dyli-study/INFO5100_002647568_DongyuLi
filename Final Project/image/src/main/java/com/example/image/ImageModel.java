package com.example.image;

import javafx.scene.image.Image;

public class ImageModel {
    private Image image;
    private String cameraModel;
    private String location;
    private String date;
    private String size;

//    The ImageModel class represents an image along with its associated metadata,
//    such as camera model, location, date, and size.

    public ImageModel(Image image, String cameraModel, String location, String date, String size) {

    //     Constructs an ImageModel instance with the specified image and metadata.
    //
    //         image:       The image object.
    //         cameraModel: The camera model used to capture the image.
    //         location:    The location where the image was captured.
    //         date:        The date when the image was captured.
    //         size:        The size of the image.

        this.image = image;
        this.cameraModel = cameraModel;
        this.location = location;
        this.date = date;
        this.size = size;
    }

    public Image getImage() {

    //        Returns the image object.

        return image;
    }

    public String getCameraModel() {

    //        Returns the camera model used to capture the image.

        return cameraModel;
    }

    public String getLocation() {

    //        Returns the location where the image was captured.

        return location;
    }

    public String getDate() {

    //        Returns the date when the image was captured.

        return date;
    }

    public String getSize() {

    //        Returns the size of the image

        return size;
    }
}
