package com.tnsif.assignment2;

import java.util.Scanner;

class Circle {
    double radius;
    String color;

    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
        System.out.print("Enter color: ");
        color = sc.next();
    }

    void calcArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.getInput();
        circle.calcArea();
    }
}
