package com.tohidul.OopPractice;
import java.lang.Math;

public class BMI {
    public static final double KILOGRAM_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;

    private String name;
    private double weight;
    private double height;

    public BMI(String name, double weight, double height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public double getBMI(){
        return (KILOGRAM_PER_POUND*weight)/(Math.pow(height*METERS_PER_INCH,2));
    }

    public String getStatus(){
        double bmi = getBMI();

        if(bmi<18.5){
            return "Underweight";
        }
        else if(bmi<25){
            return "normal";
        }
        else{
            return "overwight";
        }
    }

    public String getName(){
        return name;
    }
}
