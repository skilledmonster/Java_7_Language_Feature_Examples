package com.skilledmonster.nio.examples;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Copy Files using Files class' copy method
 *
 * @author Jagadeesh
 */
public class CopyFile {

    public static void main(String[] args) {

        // create path objects for the source file and destination file
        Path sourceFile = FileSystems.getDefault().getPath("C://skilledmonster//newfile.txt");
        Path destinationFile = FileSystems.getDefault().getPath("C://skilledmonster//copiedFile.txt");

        try {
            // create a new file using createFile method
            Files.createFile(sourceFile);
            System.out.println("Source File created successfully!");

            // copy file using copy method
            Files.copy(sourceFile, destinationFile);
            System.out.println("Source file copied to desitnation file successfully!");

        } catch (IOException e) {
            System.out.println("IO Exception occurred ");
            e.printStackTrace();
        }
    }
}