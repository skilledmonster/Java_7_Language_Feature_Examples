package com.skilledmonster.nio.examples;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.spi.FileSystemProvider;

/**
 * FileSystem Example
 *
 * @author Jagadeesh
 */
public class FileSystemExample {

    public static void main(String[] args) {
        // obtain reference to FileSystem object
        FileSystem fileSystem = FileSystems.getDefault();
        FileSystemProvider provider = fileSystem.provider();

        // display provider 
        System.out.println("Provider: " + provider.toString());
        // display file open status
        System.out.println("Open: " + fileSystem.isOpen());
        // display if the file is read only
        System.out.println("Read Only: " + fileSystem.isReadOnly());

        // display root level directories
        Iterable<Path> rootDirectories = fileSystem.getRootDirectories();
        System.out.println("\nRoot Directories");

        for (Path path : rootDirectories) {
            System.out.println(path);
        }

//        // display filestores available
//        Iterable<FileStore> fileStores = fileSystem.getFileStores();
//        System.out.println("\nFile Stores");
//        for (FileStore fileStore : fileStores) {
//            System.out.println(fileStore.name());
//        }

        // 
        Path path = FileSystems.getDefault().getPath("C://Workspace//Personal//Java_7_Language_Features//");

        try (DirectoryStream<Path> ds = Files.newDirectoryStream(path)) {
            for (Path p : ds) {
                // Iterate over the paths in the directory and print filenames
                System.out.println(p.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
