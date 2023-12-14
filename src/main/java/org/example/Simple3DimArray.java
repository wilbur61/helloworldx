package org.example;


public class Simple3DimArray {

    public static void main(String[] args) {
        // Declare and initialize a 3D array of integers
        int[][][] myArray = {
                { {1, 2, 3}, {4, 5, 6} },
                { {7, 8, 9}, {10, 11, 12} }
        };

        // Accessing elements
        System.out.println("Element at [0][1][2]: " + myArray[0][1][2]); // Outputs 6

        // Looping through all elements
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                for (int k = 0; k < myArray[i][j].length; k++) {
                    System.out.print(myArray[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}