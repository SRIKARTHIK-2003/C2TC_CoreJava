package com.tnsif.daythree;

public class NumberPyramid {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pattern

        // Loop to iterate over each row
        for (int i = 1; i <= rows; i++) {
            // Loop to print numbers for each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
