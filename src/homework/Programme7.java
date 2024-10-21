package homework;

import java.util.Scanner;

public class Programme7 {
    /**
     * Write a java program input sales id, seller's name, sales amount, and salary basic and
     * then fined this sales
     * Commission
     * Sales amount >= 50,000 35%
     * Sales amount >= 30,000 20%
     * >= 20,000 10%
     * >= 10,000 5%
     * < 10,000 2%
     */
    static int salesID;
    static String sellerName;
    static double salesAmount;
    static int basicSalary;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input details

        System.out.println("Enter sales ID: ");
        salesID = scanner.nextInt();

//        System.out.println("Enter sellers name: ");
//        sellerName = scanner.nextLine();
        sellerName = "Tithi";

        System.out.println("Enter sales amount: ");
        salesAmount = scanner.nextDouble();

        System.out.println("Enter basic Salary: ");
        basicSalary = scanner.nextInt();

        System.out.println("commission is" + calculateCommission(salesAmount));
    }

    static double calculateCommission(double salesAmount) {

        double commission = 0;

        if (salesAmount > 50000)
            commission = salesAmount * 0.35;
        if (salesAmount > 30000)
            commission = salesAmount * 0.20;
        if (salesAmount > 20000)
            commission = salesAmount * 0.10;
        if (salesAmount > 10000)
            commission = salesAmount * 0.05;
        if (salesAmount < 10000)
            commission = salesAmount * 0.02;

        return commission;

    }
}





