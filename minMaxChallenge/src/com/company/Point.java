package com.company;

public class Point {

            private int x;
            private int y;

            public double distance (){
                return Math.sqrt(((Math.pow(x,2))+(Math.pow(y,2))));
            }
            public double distance (int x,int y){

                return Math.sqrt(((getX()-x)*(getX()-x))+((getY()-y)*(getY()-y)));

            }
            public double distance (Point second){
                    return distance(second.x,second.y);
            }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }
}
