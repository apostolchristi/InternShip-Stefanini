package com.company.Task_2;

/*
TASK NR 2 - DESCRIPTION:
2.	Write a program that reads an integer angle (which may be positive or negative) and normalizes it to a value between
0 and 359 degrees. (Hint: try to use % then try with Math.floorMod )
*/

public class IntegerNormalizes {

    public static void main(String[] args) {

        int num = 0;
        System.out.println(normalizingAngleModulus(num));
        System.out.println(normalizingAngleMath_floorMood(num));

    }

    //Math.floorMod version
    public static int normalizingAngleMath_floorMood(int angle) {

        return Math.floorMod(angle, 360);

    }

    //Modulus(%) version
    public static int normalizingAngleModulus(int angle) {

        int i360 = 360;

        //reduce the angle
        angle = angle % i360;

        //positive reminder
        angle = (angle + i360) % i360;

        return angle;

    }


}

