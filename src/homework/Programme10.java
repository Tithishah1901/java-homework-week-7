package homework;

import java.util.Scanner;

public class Programme10 {
    /**
     * Write a java program to input any two number and ask user to enter their symbol (+, -,
     * /, *) find addition, Subtraction, multiplication and division according to their symbol
     * (using if else)
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input two number from user
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        //for the symbol (+,-,*,/,)
        System.out.println("Enter the symbol (+, -, *, /): ");
        char symbol = scanner.next().charAt(0);

        // perform the data based on the entered symbol
        if (symbol == '+') {
            System.out.println("Result: " + (num1 + num2));
        } else if (symbol == '-') {
            System.out.println("Result:" + (num1 - num2));
        } else if (symbol == '*') {
            System.out.println("Result:" + (num1 * num2));
        } else if (symbol == '/') {
            if (num2 != 0) {
                System.out.println("Result:" + (num1 / num2));
            } else {
                System.out.println("Error: division by zero is not allowed");
            }
        } else {
            System.out.println("Invalid symbol. please enter +,-,*, or /. ");
        }
        scanner.close();
    }
}
