package org.example;

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        // Create and initialize the String array
        String[] colors = {"red", "green", "blue", "yellow"};

        // Print the array length
        System.out.println("Original array length: " + colors.length);

        // Create a copy of the array using clone()
        String[] colorsCopy = colors.clone();

        // Verify the copy using Arrays.toString()
        String copiedColorsString = Arrays.toString(colorsCopy);
        System.out.println("Copied array: " + copiedColorsString);

        // Check if the original and copied arrays are the same object
        System.out.println("Are arrays the same object? " + (colors == colorsCopy));

        // Check if the arrays have the same content
        System.out.println("Do arrays have the same content? " + Arrays.equals(colors, colorsCopy));
    }
}


