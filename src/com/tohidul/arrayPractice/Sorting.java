package com.tohidul.arrayPractice;

public class Sorting {
    public static int[] selectionSort(int[] anArray){
        for(int i=0; i<anArray.length; i++){
            int minVal = Integer.MAX_VALUE;
            int minIdx = -1;
            for(int j=i; j<anArray.length; j++){
                if(anArray[j]<minVal){
                    minVal = anArray[j];
                    minIdx = j;
                }
            }
            int temp = anArray[i];
            anArray[i] = minVal;
            anArray[minIdx] = temp;
        }

        return  anArray;
    }
}
