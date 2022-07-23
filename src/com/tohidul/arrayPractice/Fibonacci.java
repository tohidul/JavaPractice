package com.tohidul.arrayPractice;

public class Fibonacci {
    private int[] fibonacciArray = new int[100];

    public int[] printFibonacci(){
        for(int i=0; i<100; i++){
            if(i==0){
                fibonacciArray[i] = 0;
            }
            else if(i==1){
                fibonacciArray[i] = 1;
            }
            else{
                fibonacciArray[i] = fibonacciArray[i-1]+fibonacciArray[i-2];
            }
        }

        return fibonacciArray;
    }

}
