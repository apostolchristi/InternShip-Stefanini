package com.company.Task_1;

/*
TASK NR 1 - DESCRIPTION:
Write a program that reads an integer and prints it in binary, octal and hexadecimal format.
*/
public class IntegerToOtherFormats {

    public static void main(String[] args) {

        System.out.println(Integer.toString(100,8));
        System.out.println(Integer.toString(100,2));
        System.out.println(Integer.toString(100,16));

        Integer i = 100;
        String binary = Integer.toBinaryString(i);
        System.out.println("Binary Value = " + binary);

        int x = 100;
        System.out.println(Integer.toBinaryString(x));

    }


}
