package homework;

import java.util.Scanner;

public class Programme6 {
    /**
     * Write a java program to input any number and find out if it’s odd or even
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // enter a number
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0 ){
            System.out.println(number + " is even number.");
            }else{
            System.out.println(number + " is odd number.");

        }
        scanner.close();
    }
}
