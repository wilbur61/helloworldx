package org.example;


import java.util.Arrays;

public class Task9 {

    public static void main(String[] args) {
        int[] data = {4, 2, 9, 13, 1, 0};

        // Sort the array in ascending order using Arrays.sort()
        Arrays.sort(data);

        // Print the sorted array
        System.out.println("Array in ascending order:");
        for (int element : data) {
            System.out.print(element + ", ");
        }
        System.out.println();

        // Print the smallest and largest element
        System.out.println("The smallest number is " + data[0]);
        System.out.println("The biggest number is " + data[data.length - 1]);
    }
}
