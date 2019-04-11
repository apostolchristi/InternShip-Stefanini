package com.company.Task_9;

/*
TASK NR 9 - DESCRIPTION:
Implement an immutable class Point that describe a point in the plane. Provide the constructor to set it to a specific point,
a no-arg constructor to set it to the origin, and methods x, y, translate and scale. The translate method scales both
coordinates by a given factor. Implement these methods so that they return new points with the results.
For ex:Point p = new Point(3, 4).translate(1, 3).scale(0.5);
*/


public final class Point {

    private  double x;
    private  double y;

    public Point() {
        this(0,0);
    }


    public Point(double getX, double getY) {
        this.x = getX;
        this.y = getY;
    }


    public Point translate(double x, double y) {
       this.x += x;
       this.y += y;
        return this;
    }


    public Point scale(double scale) {
        this.x *= scale;
        this.y *= scale;
        return this;
    }


    public double getX() {
        return x;
    }


    public double getY() {
        return y;
    }


}
