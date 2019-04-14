package com.company.Task_3;

/*
TASK NR 3 - DESCRIPTION:
Using conditional operator, write a program that reads three integers and prints the largest.
Reapeat with Math.max.
*/

public class TheLargestNumber {

    public static void main(String[] args) {

        theLargestIntegerBasic(-1, 5, 0);
        theLargestIntegerMath_max(-1, 5, 0);

    }


    // Math.max version
    public static void theLargestIntegerMath_max(int first, int second, int third) {

        int compare = Math.max(first, second);
        int result = Math.max(compare, third);
        System.out.println("The largest number is: " + result);

    }


    //Basic version
    public static void theLargestIntegerBasic(int first, int second, int third) {

        if (first == 0 && second == 0 && third == 0) {
            System.out.println("The largest number is: " + 0);
        } else if ((first <= -1 && second == 0 && third == 0) || (first == 0 && second <= -1 && third == 0) || first == 0 && second == 0 && third <= -1) {
            System.out.println("The largest number is: " + 0);
        }

        if (first > second && first > third) {
            System.out.println("The largest number is: " + first);
        } else if (second > first && second > third) {
            System.out.println("The largest number is: " + second);
        } else if (third > first && third > second) {
            System.out.println("The largest number is: " + third);
        }

    }


}
