package homework;

public class Programme18 {
    /**
     *  Write a Java program to sum values of an array.
     */

    public static void main(String[] args) {
        //add some values for array
        int [] numbers = {4,5,6,7,8,9};

        // call the sumArray method and print the result
        int sum = sumArray(numbers);
        System.out.println("The sum of the array value is: " + sum);
    }


    public static int sumArray(int[] array){
        int sum = 0;
        for (int number : array){
            sum += number;
        }
        return sum;
    }
}
