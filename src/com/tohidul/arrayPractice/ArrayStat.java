package com.tohidul.arrayPractice;
import java.lang.Math;
public class ArrayStat {
    public static int median(int[] anArray){

        if((anArray.length/2)%2 == 1){
            return anArray[anArray.length/2];
        }
        else{
            return (anArray[anArray.length/2]+anArray[(anArray.length/2)-1])/2;
        }
    }
    public static int mean(int[] anArray){
        int total = 0;
        for(int i=0;i<anArray.length; i++){
            total+=anArray[i];
        }
        return total/anArray.length;
    }

    public static int findNTimes(int[] anArray, int n){
        int numberOfN = 0;

        for(int i=0; i<anArray.length; i++){
            if(anArray[i] == n) {
                numberOfN += 1;
            }
        }
        return numberOfN;
    }

    public static double getDeviation(int[] anArray){
        int mean = mean(anArray);
        double squaredSumOfDifference = 0;
        for(int i=0; i<anArray.length; i++){
            squaredSumOfDifference+=Math.pow((anArray[i]-mean),2);
        }

        return Math.sqrt(squaredSumOfDifference/anArray.length);

    }
}
