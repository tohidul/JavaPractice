package com.tohidul.arrayPractice;

public class MinMaxFinder {
    public static int findMin(int[] anArray){
        int minVal = Integer.MAX_VALUE;

        for(int i=0; i<anArray.length; i++){
            if(anArray[i] < minVal){
                minVal = anArray[i];
            }
        }
        return minVal;
    }
    public static int findMax(int[] anArray){
        int maxVal = Integer.MIN_VALUE;

        for(int i=0; i<anArray.length; i++){
            if(anArray[i] > maxVal){
                maxVal = anArray[i];
            }
        }
        return maxVal;
    }
}
