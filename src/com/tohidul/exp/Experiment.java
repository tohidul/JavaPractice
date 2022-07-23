package com.tohidul.exp;
import java.util.Scanner;

public class Experiment {
    public void exp1(){
        int number = 1;
        switch (number){
            default:
                System.out.println("This is default output");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
        }
    }

    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }

    public int multiplication(int a, int b){
        return a*b;
    }

    public int division(int a, int b){
        return a/b;
    }

    public void calc(){
        Scanner scr = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Please choose: ");
            System.out.println("1 for addition");
            System.out.println("2 for subtraction");
            System.out.println("3 for multiplication");
            System.out.println("4 for division");
            System.out.println("0 for quit");

            choice = scr.nextInt();

            System.out.println("Enter a number");
            int a = scr.nextInt();
            System.out.println("Enter another number");
            int b = scr.nextInt();
            int result;
            switch (choice){
                case 1:
                    result = add(a, b);
                    System.out.println("Your result: "+ result);
                    break;
                case 2:
                    result = subtract(a,b);
                    System.out.println("Your result: "+ result);
                    break;
                case 3:
                    result = multiplication(a,b);
                    System.out.println("Your result: "+ result);
                    break;
                case 4:
                    result = division(a,b);
                    System.out.println("Your result: "+ result);
                    break;
                default:
                    System.out.println("Invalid input");
            }
        } while (choice!=0);
    }
}
