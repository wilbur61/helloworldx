package org.example;


import java.util.Scanner;

public class GradeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your score (0-100): ");
        int score = scanner.nextInt();

        // Check if the score is within range
        if (score < 0 || score > 100) {
            System.out.println("Score out of range");
        } else {
            // Use nested if-else statements to determine the grade
            if (score >= 90) {
                System.out.println("Your grade is: A");
            } else

            if (score >= 80) {
                System.out.println("Your grade is: B");
            } else

            if (score >= 70) {
                System.out.println("Your grade is: C");
            } else

            if (score >= 60) {
                System.out.println("Your grade is: D");
            } else {
                System.out.println("Your grade is: F");
            }
        }
    }
}