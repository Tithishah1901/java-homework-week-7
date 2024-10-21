package homework;

import java.util.Scanner;

public class Programme20 {

    /**
     * Write a Java program to test if an array contains a specific value.
     */
    public static void main(String[] args) {
        // initialize the array
        int [] numbers = {10,20,30,40,50};

        // get value tp search for
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to search for: ");
        int value = scanner.nextInt();

        // check if the array contains the value
        boolean found = false;
        for (int number : numbers){
            if (number == value){
                found = true;
                break;

            }
        }
        // output the result
        if (found){
            System.out.println("The array contains the value" + value);
        }else{
            System.out.println("The array does not contain the value " + value);
        }
        scanner.close();
    }
}
