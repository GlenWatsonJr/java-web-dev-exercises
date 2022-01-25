package exercieses;

import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Length of the rectangle: ");
        int length = input.nextInt();
        System.out.println("Width of the rectangle: ");
        int width = input.nextInt();
        int area = width * length;
        System.out.println("The area is: " + area);


    }
}
