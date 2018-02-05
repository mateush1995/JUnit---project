package com.junitTest;

public class Numbers {
    private int x;
    private int y;

    public Numbers(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public boolean isGreater(){
        if(x > y)
            return true;
        else
            return false;
    }
}
