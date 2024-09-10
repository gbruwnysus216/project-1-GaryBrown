package com.csc205.project1;

public class Point {

    //Class fields
    private double x;
    private double y;
    private int counter;

    //default constructor
    public Point(){
        this.x=0;
        this.y=0;
        this.counter = 1;
    }
    //Parameterized constructor
    public Point(double x,double y){
        this.x = x;
        this.y = y;
        this.counter++;
    }

    //Mutators
    public void setX(double x){
        this.x=x;
    }

    public void setY(double y){
        this.y=y;
    }

    //Accessors
    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public void setPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void shiftX(double n){
        this.x +=n;
    }

    public void shiftY(double n){
        this.x +=n;
    }

    public double distance(Point p2){
        return Math.sqrt(Math.pow(this.x-p2.x,2) +Math.pow(this.y-p2.y,2));
    }

    public void rotate(double angle){
        //temp variables
        double xPrime= this.x;
        double yPrime = this.y;
        //rotate point
        this.x = xPrime *Math.cos(angle) - yPrime*Math.sin(angle);
        this.y = xPrime *Math.sin(angle) + yPrime*Math.cos(angle);
    }

    public String toString(){
        return "Point +counter+ : ("+this.x+","+this.y+")";
    }

}
