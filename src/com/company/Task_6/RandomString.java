package com.company.Task_6;

/*
TASK NR 6 - DESCRIPTION:
Write a program that produces a random string of letters and digits by generating
a random long value and printing it in base 36.
*/

import java.util.Random;

public class RandomString {

    public static void main(String[] args) {

        System.out.println(randomString());

    }


    public static String randomString() {
        Random random = new Random();
        String str = Long.toString(random.nextLong(), 36);
        return str;
    }

}
