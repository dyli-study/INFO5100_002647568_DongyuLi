package com.example.image;

import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Metadata;
import com.drew.metadata.exif.ExifIFD0Directory;
import com.drew.metadata.exif.ExifSubIFDDirectory;
import com.drew.metadata.exif.GpsDirectory;
import javafx.scene.image.Image;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DrewDataExtractor extends ImageDataExtractor {

//    This class extends the ImageDataExtractor and implements the extractData method
//    to extract image metadata using the metadata-extractor library by Drewoakes.

    @Override
    public ImageModel extractData(File file) {

    //        Extracts metadata from the input image file and returns an ImagePattern object
    //        containing the extracted data.

        try {
            // Load the image using JavaFX Image class
            Image image = new Image(file.toURI().toString());

            // Read metadata from the image file using metadata-extractor library
            // File The input image file to extract metadata from.
            Metadata metadata = ImageMetadataReader.readMetadata(file);

            // Get directories containing specific metadata
            ExifIFD0Directory exifIFD0Directory = metadata.getFirstDirectoryOfType(ExifIFD0Directory.class);
            ExifSubIFDDirectory exifSubIFDDirectory = metadata.getFirstDirectoryOfType(ExifSubIFDDirectory.class);
            GpsDirectory gpsDirectory = metadata.getFirstDirectoryOfType(GpsDirectory.class);

            // Extract camera model, location, date and image size
            String cameraModel = (exifIFD0Directory != null && exifIFD0Directory.containsTag(ExifIFD0Directory.TAG_MODEL)) ? exifIFD0Directory.getDescription(ExifIFD0Directory.TAG_MODEL) : "Unknown";
            String location = (gpsDirectory != null && gpsDirectory.getGeoLocation() != null) ? gpsDirectory.getGeoLocation().toString() : "Unknown";


            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String date = (exifSubIFDDirectory != null && exifSubIFDDirectory.containsTag(ExifSubIFDDirectory.TAG_DATETIME_ORIGINAL)) ? dateFormat.format(exifSubIFDDirectory.getDate(ExifSubIFDDirectory.TAG_DATETIME_ORIGINAL)) : "Unknown";

            String size = "Size: " + image.getWidth() + "x" + image.getHeight();

            // Return An ImagePattern object containing the extracted metadata, or null if an error occurs.
            return new ImageModel(image, cameraModel, location, date, size);
        } catch (IOException | ImageProcessingException e) {
            // Print the exception stack trace and return null if an error occurs
            e.printStackTrace();
            return null;
        }
    }
}
