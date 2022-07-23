package com.tohidul.arrayPractice;

public class MyStack {
    private int[] stackArray;
    private int stackLength;
    private int stackPointer;

    public MyStack(int[] anArray, int pointer){
        stackLength = anArray.length;
        stackArray = new int[anArray.length];

        System.arraycopy(anArray, 0, stackArray, 0, stackLength);
        stackPointer = pointer;

        if(stackPointer<0 || stackPointer>=stackLength){
            throw new RuntimeException("stack pointer should be between 0 to array length");
        }
    }
    public void addElement(int anInteger){
        if(this.stackPointer+1>this.stackLength){
            throw new RuntimeException("Stack is full");
        }
        stackArray[stackLength+1] = anInteger;
        stackPointer++;
    }
    public int removeElement(){
        if(this.stackPointer <= 0){
            throw new RuntimeException("Nothing to remove.");
        }
        int lastElement = stackArray[stackPointer];
        stackPointer--;
        return lastElement;
    }
    public int[] getStackArray(){
        return stackArray;
    }
    public void printStack(){
        for(int i=0; i<stackPointer; i++){
            System.out.print(stackArray[i]);
        }
    }

}
