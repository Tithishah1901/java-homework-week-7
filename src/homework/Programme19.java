package homework;

import java.util.Scanner;

public class Programme19 {
    /**
     *  Write a Java program to calculate the average value of array elements.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // user for the number of elements
        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // declare an array to store the elements
        double [] arr = new double[n];

        // variable to store the elements
        double sum = 0;

        // take input for each element in the array
        System.out.println(" Enter the elements of the array: ");
        for (int i = 0; i < n; i++){
            arr[i] =scanner.nextDouble();
            sum += arr[i];
        }

        // calculate the average
        double average = sum / n;

        // display the result
        System.out.println("The average value of the array elements is: " + average);

        scanner.close();
    }


}
