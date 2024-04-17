package com.tnsif.daythree;

public class Box {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for columns
            for (int j = 1; j <= cols; j++) {
                // Print '*' for the border or if it's the first or last column
                // Otherwise, print a space
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
