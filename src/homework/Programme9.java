package homework;

import java.util.Scanner;

public class Programme9 {
    /**
     * Same as above program-8 using switch statement.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an alphabet (A to F): ");
        char alphabet = scanner.next().charAt(0);

        switch (alphabet){
            case 'A':
                System.out.println("A is for America");
                break;
            case 'B':
                System.out.println("B is for Bombay");
                break;
            case 'C':
                System.out.println("C is for Chicago");
                break;
            case 'D':
                System.out.println("D is for Dubai");
                break;
            case 'E':
                System.out.println("E is for Egypt");
                break;
            case 'F':
                System.out.println("F is for France");
                break;
            default:
                System.out.println("Invalid entry");
        }
        scanner.close();
    }
}
