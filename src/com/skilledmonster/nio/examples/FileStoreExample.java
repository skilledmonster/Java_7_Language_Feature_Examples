package com.skilledmonster.nio.examples;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

/**
 * Example to get file store information
 *
 * @author Jagadeesh
 */
public class FileStoreExample {

    static final long GIGA_BYTES = (1024 * 1024 * 1024 );
    
    public static void main(String[] args) {
        // get instance of file system in use
        FileSystem fileSystem = FileSystems.getDefault();
        // get available file stores
        for (FileStore fileStore : fileSystem.getFileStores()) {
            try {
                System.out.println("FileStore Name                  : " + fileStore.name());
                System.out.println("File System                     : " + fileStore);
                System.out.println("FileStore Type                  : " + fileStore.type());
                System.out.println("Is FileStore Read-Only          : " + fileStore.isReadOnly());
                System.out.println("Total Space [GIGA BYTES]        : " + fileStore.getTotalSpace() / GIGA_BYTES );
                System.out.println("Available Space [GIGA BYTES]    : " + fileStore.getUsableSpace() / GIGA_BYTES + " \n \n");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }// end of for loop
    }// end of main
}
