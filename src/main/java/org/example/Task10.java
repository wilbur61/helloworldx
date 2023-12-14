package org.example;

public class Task10 {
    // Declare an Object array
    public static void main(String[] args) {
        Object[] mixedArray = new Object[]{5, "Hello", "World!", 3.14f};


// Print the array elements
        for (Object element : mixedArray) {
            if (element instanceof Integer) {
                System.out.println(element+" obj is an Integer");
            }
            if (element instanceof String) {
                System.out.println(element+" obj is an String");
            }
            if (element instanceof Float) {
                System.out.println(element+" obj is an Float");
            }
            //System.out.print(element + ", ");
        }
        System.out.println();
    }
}
