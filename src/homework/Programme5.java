package homework;

import java.util.Scanner;

public class Programme5 {
    /**
     * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
     * salary
     *     HRA = basic salary 10%
     *     DA = Basic salary 8%
     *     TA = Basic salary 9%
     *     PF= Basic salary 20%
     *     Gross salary = basic salary + HRA + TA + DA –PF
     * Print in following format
     * _______________________________
     * |   Salary Slip                 |
     * |______________________________|
     * | Employee Id  : 2564            |
     * | Employee Name : Jay               |
     * |______________________________|
     * | Basic Salary  : 25000.0       |
     * | HRA  10%  : 2500.0         |
     * | TA   8%  : 2250.0         |
     * | DA   9%  : 2000.0         |
     * | PF - 20&  : 5000.0         |
     * |______________________________|
     * | Gross Salary  : 26750.0       |
     * |===========================|
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // employee details
        System.out.println("Enter Employee Id: ");
        int empId = scanner.nextInt();

        System.out.println("Enter Employee Name: ");
        String empName = scanner.next();

        System.out.println("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        // calculate HRA, TA, DA, PF

        double hra = basicSalary * 0.10;
        double ta = basicSalary * 0.09;
        double da = basicSalary * 0.08;
        double pf = basicSalary * 0.20;

        // calculate Gross salary
        double grossSalary = basicSalary + hra + ta + da + pf;

        // print salary slip in required format
        System.out.println("___________________________________________");
        System.out.println("|        Salary Slip                       |");
        System.out.println("|__________________________________________|");
        System.out.println("| Employee Id  : " + empId + "             |");
        System.out.println("| Employee Name: " + empName + "           |");
        System.out.println("|__________________________________________|");
        System.out.println("| Basic Salary  : " + basicSalary + "      |");
        System.out.println("| HRA   10%     : " + hra + "              |");
        System.out.println("| TA    9%      : " + ta + "               |");
        System.out.println("| DA    8%      : " + da + "               |");
        System.out.println("| PF   -20%     : " + pf + "               |");
        System.out.println("|__________________________________________|");
        System.out.println("| Gross Salary  : " + grossSalary + "      |");
        System.out.println("|==========================================|");


     scanner.close();

    }
}

