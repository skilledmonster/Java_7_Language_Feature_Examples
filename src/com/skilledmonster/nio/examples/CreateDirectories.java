package com.skilledmonster.nio.examples;

import java.io.IOException;
import java.nio.file.*;

/**
 * Create multiple directories using Java 7 language feature
 * @author Jagadeesh
 */
public class CreateDirectories {
     public static void main(String[] args) {
        try {
            // create a path object for directories
            Path dirPath  = Paths.get("C://skilled//monster//test");
            
            // create directories
            Files.createDirectories(dirPath);
            
            System.out.println("Directories created successfully!");
            
        } catch (FileAlreadyExistsException a) {
            // if a directory already exist this exception is caught
            System.out.println("Directories already exists!");
        } catch (IOException ex) {
            // generic io exception
            ex.printStackTrace();
        }
    }
}
