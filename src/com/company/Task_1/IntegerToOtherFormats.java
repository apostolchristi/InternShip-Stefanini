package com.company.Task_1;

/*
TASK NR 1 - DESCRIPTION:
Write a program that reads an integer and prints it in binary, octal and hexadecimal format.
*/
public class IntegerToOtherFormats {

    public static void main(String[] args) {

        formatConvertor(100);

    }


    public static void formatConvertor(int num) {

        String binary = Integer.toBinaryString(num);
        String octal = Integer.toOctalString(num);
        String hexadecimal = Integer.toHexString(num);

        System.out.println("The value of the decimal number is " + num + "\n" +
                "Binary value = " + binary + "\n" +
                "Octal Value = " + octal + "\n" +
                "Hexadecimal Value = " + hexadecimal);

    }


}
