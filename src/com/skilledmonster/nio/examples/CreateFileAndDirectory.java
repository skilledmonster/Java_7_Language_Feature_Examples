package com.skilledmonster.nio.examples;

import java.io.IOException;
import java.nio.file.*;

/**
 * Create File and Directory using Java 7 language features
 * @author Jagadeesh
 */
public class CreateFileAndDirectory {
    
    public static void main(String[] args) {
        try {
            // create a path object for directory
            Path dirPath  = Paths.get("C://skilledmonster");
            
            // create directory
            Path testDirectory = Files.createDirectory(dirPath);
            
            System.out.println("Directory created successfully!");
            
            //  create a path object for file
            Path newFilePath = FileSystems.getDefault().getPath("C://skilledmonster//test.txt");
            
            // create file
            Path testFile = Files.createFile(newFilePath);
            
            System.out.println("File created successfully!");
        } catch (FileAlreadyExistsException a) {
            // if a file or directory already exist this exception is caught
            System.out.println("File or directory already exists!");
        } catch (IOException ex) {
            // generic io exception
            ex.printStackTrace();
        }
    }
}