package org.example;

public class linearSearch {
        public static int search(int[] arr, int target)
        {
 //         ADD Code here!
            return -1; // Element not found
        }

        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 40, 50};
            int target = 30;
            int index = search(arr, target);
            if (index == -1) {
                System.out.println("Element not found");
            } else {
                System.out.println("Element found at index: " + index);
            }
        }
}

