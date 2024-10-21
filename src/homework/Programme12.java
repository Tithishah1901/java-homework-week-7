package homework;

import java.util.Scanner;

public class Programme12 {
    /**
     * Write a program that tells us input value is number or an alphabet or symbol.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input
        System.out.println("Enter a character: ");
        char input = scanner.next().charAt(0);

        // check if input is number
        if(Character.isDigit(input)){
            System.out.println(input + "  is a number.");
        }
        // check if input is letter
        else if(Character.isLetter(input)){
            System.out.println(input + "is a alphabet");
        }
        // check if input is symbol
        else {
            System.out.println(input + "is a symbol");
        }
        scanner.close();
    }
}
