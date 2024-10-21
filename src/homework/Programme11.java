package homework;

public class Programme11 {
    /**
     * Write a java program to print the numbers between 1 to 100 which can be divided by 3
     * and 5 separately.
     */

    public static void main(String[] args) {
        System.out.println("Numbers divided by 3: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " ");
            }
        }

        System.out.println("\n\nnumbers divided by 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
