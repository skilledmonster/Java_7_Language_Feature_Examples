package com.skilledmonster.nio.examples;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Set;

/**
 * Example to obtain file attributes in a map
 * @author Jagadeesh
 */
public class GenerateMapOfFileAttributes {

    public static void main(String[] args) throws IOException {
        // create Path object representing a file
        Path path = FileSystems.getDefault().getPath("c://skilledmonster//pom.xml");
        // call readAttributes() method and generate the map
        Map<String, Object> attributesMap = Files.readAttributes(path, "*");
        Set<String> keys = attributesMap.keySet();
        for (String attribute : keys) {
            // display all the file attributes
            System.out.println(attribute + " : "+ Files.getAttribute(path, attribute));
        }
    }
}
