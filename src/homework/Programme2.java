package homework;

public class Programme2 {
    /**
     * Write a java program to input any year like (ex.2007) and find out if it is leap year or
     * not?
     */

    public static void main(String[] args) {
        // year to be checked
        int year = 2010;
        boolean leap = false;

        // if year is divided by 4
        if (year % 4 == 0) {

            // if the year is century
            if (year % 100 == 0) {

                //if year is divided by 4
                // it is leap year
                if (year % 400 == 0)
                    leap = true;
            } else {
                leap = false;
            }
            // if the year is not century
        }
        if (leap) {
            leap = true;
        }else {
            leap = false;
        }


            if (leap) {
                System.out.println(year + "is a leap year");
            } else {
                System.out.println(year + " is not a leap year");

            }
        }
    }
