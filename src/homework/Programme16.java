package homework;

import java.util.Scanner;

public class Programme16 {
    /**
     * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
     * “ZERO”
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // enter a number
        System.out.println("Enter a number: ");
        double number = scanner.nextDouble();

        // check if the number positive, negative, or zero
        if(number > 0){
            System.out.println("The number is positive. ");
        }else if (number < 0){
            System.out.println("The number is negative. ");
        } else {
            System.out.println("The number is zero. ");
        }
        scanner.close();
    }
}
