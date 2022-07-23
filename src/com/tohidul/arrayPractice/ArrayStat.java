package com.tohidul.arrayPractice;

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
}
