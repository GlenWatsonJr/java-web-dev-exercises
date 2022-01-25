package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        boolean notCorrectInput = true;
        while (notCorrectInput) {
            Scanner input = new Scanner(System.in);
            System.out.println("What is the radius? ");
            if (input.hasNextDouble()) {
                double radius = input.nextDouble();
                if (radius > 0) {
                    double area = Circle.getArea(radius);
                    System.out.println("The area of a circle of radius " + radius + " is: " + area);
                    notCorrectInput = false;
                } else {
                    System.out.println("You entered a negative integer ");
                }
            } else {
                System.out.println("Please Enter Valid Integer");
            }
        }
    }
}
