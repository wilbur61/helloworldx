package org.example;


public class CharacterMethodsExample {

    public static void main(String[] args) {
        // Define a sample character
        char ch = 'a';

        // Check if it's a digit
        if (Character.isDigit(ch)) {
            System.out.println("Character '" + ch + "' is a digit.");
        } else {
            System.out.println("Character '" + ch + "' is not a digit.");
        }

        // Check if it's a letter
        if (Character.isLetter(ch)) {
            System.out.println("Character '" + ch + "' is a letter.");
        } else {
            System.out.println("Character '" + ch + "' is not a letter.");
        }

        // Check if it's a letter or digit (alphanumeric)
        if (Character.isLetterOrDigit(ch)) {
            System.out.println("Character '" + ch + "' is alphanumeric.");
        } else {
            System.out.println("Character '" + ch + "' is not alphanumeric.");
        }

        // Check if it's lowercase
        if (Character.isLowerCase(ch)) {
            System.out.println("Character '" + ch + "' is lowercase.");
        } else {
            System.out.println("Character '" + ch + "' is not lowercase.");
        }

        // Check if it's uppercase
        if (Character.isUpperCase(ch)) {
            System.out.println("Character '" + ch + "' is uppercase.");
        } else {
            System.out.println("Character '" + ch + "' is not uppercase.");
        }

        // Convert to lowercase and uppercase
        char lowerCase = Character.toLowerCase(ch);
        char upperCase = Character.toUpperCase(ch);
        System.out.println("Lowercase of '" + ch + "' is: " + lowerCase);
        System.out.println("Uppercase of '" + ch + "' is: " + upperCase);

        // Convert String to primitive char
        String charString = "A";
        char parsedChar = charString.charAt(0);
        System.out.println("Primitive char parsed from String: " + parsedChar);

        // Convert primitive char to Integer (decimal and radix)
        int decimalValue = Character.valueOf(ch);
        int radixValue = Integer.parseInt(String.valueOf(ch), 16); // Hexadecimal
        System.out.println("Decimal value of '" + ch + "' is: " + decimalValue);
        System.out.println("Hexadecimal value of '" + ch + "' is: " + radixValue);
    }
}