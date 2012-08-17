package com.skilledmonster.nio.examples;

import java.io.IOException;
import java.nio.file.*;

/**
 * Java 7 Feature: Demonstrate custom directory filter recipe where we can
 * filter files based on attributes. In this example we filter and return only
 * hidden files underneath c:/Windows directory.
 *
 * @author Jagadeesh
 */
public class DirectoryFilter {

    // create anonymous inner class to define an object that implements the 
    // DirectoryStream.Filter interface
    static DirectoryStream.Filter<Path> filter = new DirectoryStream.Filter<Path>() {

        // check if a directory element should be returned
        public boolean accept(Path file) throws IOException {
            // return true if the file is hidden
            return (Files.isHidden(file));
        }
    };

    public static void main(String[] args) {
        // path object for the directory to filter
        Path directory = Paths.get("C:/Windows");
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(directory, filter)){
            for (Path file : directoryStream) {
                    System.out.println(file.getFileName());
                }
            }
         catch (IOException | DirectoryIteratorException ex) {
            ex.printStackTrace();
        }
    }
}
