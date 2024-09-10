package com.csc205.project1;
/*
 * Point class
 * This class creates a point object with x and y coordinates
 * It also has methods to shift the point, calculate distance between two points and rotate the point
 */

public class Point {

    //Class fields
    private double x;
    private double y;
    private int counter;

    /*Default constructor
     * @param x X-coordinate of the point
     * @param y Y-coordinate of the point
     */
    public Point(){
        this.x=0;
        this.y=0;
        this.counter = 1;
    }

    /*Parameterized constructor
     * @param x X-coordinate of the point
     * @param y Y-coordinate of the point
     */
    public Point(double x,double y){
        this.x = x;
        this.y = y;
        this.counter++;
    }

    //Mutator Methods
    /* Sets the x coordinate of the point after the constructor creates the point object
     * @param x X-coordinate of the point
     */
    public void setX(double x){
        this.x=x;
    }

    /* Sets the y coordinate of the point after the constructor creates the point object
     * @param y Y-coordinate of the point
     */
    public void setY(double y){
        this.y=y;
    }

    //Accessor Methods

    /* Returns the x coordinate of the point
     * @return x X-coordinate of the point
     */

    public double getX(){
        return this.x;
    }
    /* Returns the y coordinate of the point
     * @return y Y-coordinate of the point
     */
    public double getY(){
        return this.y;
    }

    /* Sets the x and y coordinates of the point
     * @param x X-coordinate of the point
     * @param y Y-coordinate of the point
     */
    public void setPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    /* Shifts the x coordinate of the point
     * @param n Value to shift the x coordinate
     */
    public void shiftX(double n){
        this.x +=n;
    }
    /* Shifts the y coordinate of the point
     * @param n Value to shift the y coordinate
     */
    public void shiftY(double n){
        this.y +=n;
    }

    /* Calculates the distance between two points
     * @param p2 Point object to calculate the distance from
     * @return distance Distance between the two points
     */

    public double distance(Point p2){
        return Math.sqrt(Math.pow(this.x-p2.x,2) +Math.pow(this.y-p2.y,2));
    }
    /* Rotates the point by a given angle
     * @param angle Angle to rotate the point
     */

    public void rotate(double angle){
        //temp variables
        double xPrime= this.x;
        double yPrime = this.y;
        //rotate point
        this.x = xPrime *Math.cos(angle) - yPrime*Math.sin(angle);
        this.y = xPrime *Math.sin(angle) + yPrime*Math.cos(angle);
    }
    /* Returns the point object as a string
     * @return String Point object as a string
     */

    public String toString(){
        return "Point"+this.counter+" : ("+this.x+","+this.y+")";
    }



}
