package com.skilledmonster.nio.examples;

import java.nio.file.FileSystems;

/**
 * Java 7 Example to get determine default file 
 * separator of the Operating System.
 *
 * @author Jagadeesh
 */
public class GetDefaultFileSeparator {

    public static void main(String[] args) {

        String separator = FileSystems.getDefault().
                getSeparator();
        System.out.println("The Default file separator is # " + separator);

    }
}
