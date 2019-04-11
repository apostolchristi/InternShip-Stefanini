package com.company.Task_10;

/*
TASK NR 10 - DESCRIPTION:
Implement an immutable class Point that describe a point in the plane. Provide the constructor to set it to a specific point,
a no-arg constructor to set it to the origin, and methods x, y, translate and scale. The translate method scales both
coordinates by a given factor. Implement these methods so that they return new points with the results.
For ex:Point p = new Point(3, 4).translate(1, 3).scale(0.5);

Repeat the preceding exercise, but now make translate and scale into mutators.
*/

public class PointMutators {

    private  double x;
    private  double y;

    public PointMutators() {
        this(0,0);
    }


    public PointMutators(double getX, double getY) {
        this.x = getX;
        this.y = getY;
    }


    public PointMutators translate(double x, double y) {
        setX(this.x + x);
        setY(this.y + y);
        return this;
    }


    public PointMutators scale(double scale) {
        setX(this.x * scale);
        setY (this.y *scale);
        return this;
    }


    public double getX() {
        return x;
    }


    public double getY() {
        return y;
    }

    private void setX(double x) {
        this.x = x;
    }

    private void setY(double y) {
        this.y = y;
    }
}
