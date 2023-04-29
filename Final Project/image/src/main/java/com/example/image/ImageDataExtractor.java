package com.example.image;

import java.io.File;

public abstract class ImageDataExtractor {

//    The ImageDataExtractor is an abstract class that defines a contract for extracting
//    metadata from an image file.

    public abstract ImageModel extractData(File file);

//    This abstract method should be implemented by subclasses to extract metadata
//    from the given image file and return an ImageModel object containing the
//    extracted data.
//
//            file： The input image file from which to extract metadata.
//            ImageModel： object containing the extracted metadata.

}
