package homework;

import java.util.Scanner;

public class Programme1 {
    /**
     * Write a java program that tells us that Input number is odd or even?
     * HINT: use ternary operator (? :)
     */

    public static void main(String[] args) {

        Scanner oddEven = new Scanner(System.in);

        // enter number
        System.out.println("Enter a number: ");
        int num = oddEven.nextInt();

        // even number or odd number
        if (num % 2 == 0) {
            System.out.println(num + "  Is even number");
        } else {
            System.out.println(num + "  Is odd number");

         oddEven.close();
        }

    }

}