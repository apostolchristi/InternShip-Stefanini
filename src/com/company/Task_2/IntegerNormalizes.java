package com.company.Task_2;

/*
TASK NR 2 - DESCRIPTION:
2.	Write a program that reads an integer angle (which may be positive or negative) and normalizes it to a value between
0 and 359 degrees. (Hint: try to use % then try with Math.floorMod )
*/

public class IntegerNormalizes {

    public static void main(String[] args) {

        System.out.println(normalizingAngle1(-2000));
        System.out.println(normalizingAngle2(-2000));
        System.out.println(normalizingAngle3(-2000));

    }


    public static int normalizingAngle3(int angle) {

        angle = Math.floorMod(angle, 359);
        return angle;

    }


    public static int normalizingAngle2(int angle) {

        //reduce the angle
        angle = angle % 359;

        //positive reminder
        angle = (angle + 359) % 359;

        //negative reminder
        if(angle > 180) {
            angle -= 359;
        }

        return angle;

    }


    public static int normalizingAngle1(int angle) {

        int newAngle = angle;
        while(newAngle <= -180) {
            newAngle += 359;
        }
        while (newAngle > 180) {
            newAngle -= 359;
        }
        return newAngle;

    }


}

