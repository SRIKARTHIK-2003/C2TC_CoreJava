package com.tnsif.assignment2;

import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input details from the user
        System.out.println("Enter your full name with Initial:");
        String fullName = scanner.nextLine();

        System.out.println("Enter your roll number:");
        String rollNumber = scanner.nextLine();

        System.out.println("Enter your grade:");
        String grade = scanner.nextLine();

        System.out.println("Enter your percentage:");
        String percentage = scanner.nextLine();

        // Displaying the details
        System.out.println("\nSample Output:");
        System.out.println(fullName);
        System.out.println(rollNumber);
        System.out.println(grade);
        System.out.println(percentage);
    }
}
