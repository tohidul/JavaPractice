package com.tohidul.geometry;

import java.awt.Point;

public class Rectangle {
    private int width = 0;
    private int height = 0;
    private Point origin;

    public Rectangle(int w, int h){
        origin = new Point(0,0);
        width = w;
        height = h;
    }

    public void move(int x, int y){
        origin.x = x;
        origin.y = y;
    }

    public int getArea(){
        return width*height;
    }
}
