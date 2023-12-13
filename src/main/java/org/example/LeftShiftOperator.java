package org.example;

public class LeftShiftOperator {


    public static void main(String[] args) {
        // Declare and assign value to x
        int x = 2;

        // Print the binary string representation of x
        System.out.println("x = " + x + ", binary: " + Integer.toBinaryString(x));

        // Perform left shift by 1
        x = x << 1;

        // Predict the new decimal value and binary string
        int predictedDecimal = x * 2;
        String predictedBinary = Integer.toBinaryString(predictedDecimal);

        System.out.println("\nPredicted decimal value: " + predictedDecimal + ", binary: " + predictedBinary);

        // Print the updated value of x
        System.out.println("\nx = " + x + ", binary: " + Integer.toBinaryString(x));
    }
}