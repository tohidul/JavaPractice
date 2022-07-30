package com.tohidul.genericsPractice;

public class Container<T> {
    private static final int MAX_LENGTH = 10;

    private T[] items;
    private int currentIndex = 0;

    public Container(){
        items = (T[]) new Object[MAX_LENGTH];
    }
}
