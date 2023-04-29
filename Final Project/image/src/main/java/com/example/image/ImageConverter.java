package com.example.image;

import java.io.File;
import java.util.List;
import java.util.function.Consumer;

public interface ImageConverter {

//    The ImageConverter interface defines a contract for converting a list of image files
//    to a specified format.

    void convertImages(List<File> inputFiles, String format, Consumer<Double> onProgress);

//    This method converts the input image files to the specified format and reports
//    progress using a Consumer<Double>.
//
//              inputFiles： A list of input image files to be converted.
//              format：     The target format to which the input images will be converted.
//              onProgress： A Consumer<Double> that will be called to report progress. The
//                           input value will be between 0.0 and 1.0, representing the
//                           percentage of completion.

}
