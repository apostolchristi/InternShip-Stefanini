package com.company.Task_2;

/*
TASK NR 2 - DESCRIPTION:
2.	Write a program that reads an integer angle (which may be positive or negative) and normalizes it to a value between
0 and 359 degrees. (Hint: try to use % then try with Math.floorMod )
*/

public class IntegerNormalizes {

    //Math.floorMod version
    public int normalizingAngleMath_floorMood(int angle) {

        return Math.floorMod(angle, 360);
    }


    //Modulus(%) version
    public int normalizingAngleModulus(int angle) {

        int i360 = 360;

        //reduce the angle
        angle = angle % i360;

        //positive reminder
        angle = (angle + i360) % i360;

        return angle;
    }


    public static void main(String[] args) {
        IntegerNormalizes referenceTask2 = new IntegerNormalizes();
        int num = -1;
        System.out.println(referenceTask2.normalizingAngleModulus(num));
        System.out.println(referenceTask2.normalizingAngleMath_floorMood(num));

    }

}

