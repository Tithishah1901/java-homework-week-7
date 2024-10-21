package homework;

import java.util.Arrays;

public class Programme17 {
    /**
     *  Write a Java program to sort a numeric array and a string array.
     */
    public static void main(String[] args) {
        // numeric array
        int [] numericArray = {5,8,4,9};

        // String array
        String[] stringArray = {"Name","Class","Java","Testing"};

        // sorting the numeric array
        Arrays.sort(numericArray);

        // sorting the string array
        Arrays.sort(stringArray);

        // print the sorted numeric array
        System.out.println("sorted numeric array: " + Arrays.toString(numericArray));

        // print the sorted string array
        System.out.println("sorted string array: " + Arrays.toString(stringArray));

    }
}
