package com.skilledmonster.nio.examples;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Determine content type of the file
 *
 * @author Jagadeesh
 */
public class CheckFileContentType {

    public static void main(String[] args) throws Exception {
        // text file
        System.out.println(returnContentType("c://skilledmonster//pom.xml"));
        // csv file
        System.out.println(returnContentType("C://skilledmonster//sftp//CURRENCY_LKUP.csv"));
    }

    /**
     * Method to return content type
     *
     * @param pathText file location
     * @return content type
     * @throws Exception
     */
    public static String returnContentType(String pathText) throws Exception {

        // get Path object
        Path path = Paths.get(pathText);

        // probe the content
        String contentType = Files.probeContentType(path);

        // return content type
        return contentType;

    }
}