package homework;

import java.util.Scanner;

public class Programme3 {
    /**
     * Write a java program to input student Name, roll No, and three subjects Math, Science and
     * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
     * Input, Marks should between 0 to 100”) and find out total, percentage and result.
     * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
     * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
     */


    static String studentName;
    static int rollNumber;
    static String subject[] = {"Maths", "Science", "English"};
    static int Maths;
    static int Science;
    static int English;
    static int total;
    static float percentage;
    static String result;
    static String Grade;

    public static void errorMessage() {
        int marks = 100;
        if (marks < 1 && marks > 100) {
            System.out.println(" it is invalid number");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name: ");
        studentName = scanner.nextLine();

        System.out.println("Enter the roll number: ");
        rollNumber = scanner.nextInt();

        System.out.println("Enter marks in Maths (0 to 100");
        Maths = scanner.nextInt();

        System.out.println("Enter marks in Science (0 to 100");
        Science = scanner.nextInt();

        System.out.println("Enter marks in English (0 to 100");
        English = scanner.nextInt();

        total = Maths + Science + English;
        percentage = (float) total / subject.length;

        if (total >= 35)
            result = "pass";
        else result = "fail";

        Grade = getGrade(total);




        System.out.println("|________________________________________________________|");
        System.out.println("|                 Mark Sheet                             |");
        System.out.println("|________________________________________________________|");
        System.out.println("|                                                        |");
        System.out.println("|    Name     :    " + studentName + "                   |");
        System.out.println("|    Roll No  :    " + rollNumber + "                    |");
        System.out.println("|________________________________________________________|");
        System.out.println("|    Subject   :   Marks                                 |");
        System.out.println("|________________________________________________________|");
        System.out.println("|     Maths    :     " + Maths + "                       |");
        System.out.println("|     Science  :    " + Science + "                      |");
        System.out.println("|     English  :    " + English + "                      |");
        System.out.println("|________________________________________________________|");
        System.out.println("|     Total    :    " + total + "                        |");
        System.out.println("|----------------------------------------------------|");
        System.out.println("|     Percentage :   " + percentage + "                  |");
        System.out.println("|     Result     :    " + result + "                     |");
        System.out.println("|     Grade       :    " + Grade + "                     |");
        System.out.println("|----------------------------------------------------|");

        scanner.close();
    }

    public static String getGrade(int total) {
        String grade = "";
        if (percentage >= 80 && percentage < 100) {
            grade = "A+";
        } else if (percentage >= 60 && percentage < 70) {
            grade = "A";
        } else if (percentage >= 50 && percentage < 60) {
            grade = "B";
        } else if (percentage >= 35 && percentage < 50) {
            grade = "C";
        }
        return grade;
        }


    }






