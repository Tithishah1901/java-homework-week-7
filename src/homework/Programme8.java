package homework;

import java.util.Scanner;

public class Programme8 {
    /**
     * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
     * any other alphabet should be invalid entry
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // user to input an alphabet
        System.out.println("Enter an alphabet (A to F): ");
        char alphabet = scanner.next().toUpperCase().charAt(0);


        // using if-else to match the alphabet and print the city name

        if (alphabet == 'A') {
            System.out.println("The city according to A is Ahmedabad: ");
        } else if (alphabet == 'B') {
            System.out.println("The city according to B is Bombay: ");
        } else if (alphabet == 'C') {
            System.out.println("The city according to C is Chicago: ");
        } else if (alphabet == 'D') {
            System.out.println("The city according to D is Dubai: ");
        } else if (alphabet == 'E') {
            System.out.println("The city according to E is Egypt: ");
        } else if (alphabet == 'F') {
            System.out.println("The city according to F is France: ");
        } else {
            System.out.println("Invalid entry, please enter a letter between A and F");

        }
        scanner.close();
    }
}
