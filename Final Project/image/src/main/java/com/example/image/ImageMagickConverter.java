package com.example.image;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;

public class ImageMagickConverter implements ImageConverter {

//    The ImageMagickConverter class is an implementation of the ImageConverter interface
//    that uses the ImageMagick command-line tool to convert images.

    @Override
    public void convertImages(List<File> inputFiles, String format, Consumer<Double> onProgress) {

//        Converts a list of image files to the specified format using the ImageMagick
//        command-line tool, and reports progress using a Consumer<Double>.
//
//                inputFiles: A list of input image files to be converted.
//                format:     The target format to which the input images will be converted.
//                onProgress: A Consumer<Double> that will be called to report progress. The
//                            input value will be between 0.0 and 1.0, representing the
//                            percentage of completion.

        int totalImages = inputFiles.size();
        int convertedImages = 0;

        for (File file : inputFiles) {
            String outputFilename = removeExtension(file.getName()) + "." + format;
            File outputFile = new File(file.getParent(), outputFilename);
            ProcessBuilder pb = new ProcessBuilder("magick", file.getAbsolutePath(), outputFile.getAbsolutePath());
            pb.redirectErrorStream(true);

            try {
                Process process = pb.start();
                process.waitFor();
                convertedImages++;
                onProgress.accept((double) convertedImages / totalImages);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private String removeExtension(String filename) {

//        Removes the file extension from the input filename and returns the filename without extension.

        int lastDotIndex = filename.lastIndexOf('.');

//        filename The input filename with extension.

        if (lastDotIndex == -1) {
            return filename;
        }
        return filename.substring(0, lastDotIndex);

//        return The filename without the extension.

    }
}
