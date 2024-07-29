package com.tnsif.assignment2;

class Student {
    Student() {
        System.out.println("Student object is created");
    }
}

class Commission {
    String name, address, phone;
    double sales_amount, commission;

    void acceptDetails(String name, String address, String phone, double sales_amount) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.sales_amount = sales_amount;
    }

    void calculateCommission() {
        if (sales_amount >= 100000) {
            commission = sales_amount * 0.1;
        } else if (sales_amount >= 50000) {
            commission = sales_amount * 0.05;
        } else if (sales_amount >= 30000) {
            commission = sales_amount * 0.03;
        } else {
            commission = 0;
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Sales Amount: " + sales_amount);
        System.out.println("Commission: " + commission);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student(); // Creating a Student object

        Commission c = new Commission();
        c.acceptDetails("John Doe", "123 Main St", "1234567890", 80000);
        c.calculateCommission();
        c.display();
    }
    }

