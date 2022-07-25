package com.tohidul.OopPractice;
import java.lang.Math;

public class AreaCalculator {
    public double getArea(double radius){
        return 3.1416*Math.pow(radius,2);
    }
    public double getArea(int length, int width){
        return length*width;
    }
    public double getArea(double radius, double height){
        return 2*3.1416*radius*(radius+height);
    }
}
