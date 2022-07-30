package com.tohidul.genericsPractice;

public class GenericStack<T> {
    private int size;
    private T[] stackObj;
    private int current = -1;

    public GenericStack(T[] obj, int size){
        this.stackObj = obj;
        this.size = size;
    }

    public void push(T t){
        if(current == size){
            throw new ArrayIndexOutOfBoundsException("Stack is full");
        }
        current++;
        this.stackObj[current] = t;
    }

    public T peek(){
        if(current<0){
            throw new ArrayIndexOutOfBoundsException("Stack is empty");
        }
        return stackObj[current];
    }

    public T pop(){
        if(current<0){
            throw new ArrayIndexOutOfBoundsException("Stack is empty");
        }
        return stackObj[current--];
    }
}
