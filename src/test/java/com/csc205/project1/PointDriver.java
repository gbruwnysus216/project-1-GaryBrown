package com.csc205.project1;
public class PointDriver {

    public static void main(String[] args){
        Point p1 = new Point();
        Point p2 = new Point(1.0,1.0);

        System.out.print("The point locations after using constructor methods are:\n");
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        //Change location of point 1
        p1.setX(3.5);
        p1.setY(4.7);
        System.out.print("The point locations after using mutator methods are:\n");
        System.out.println(p1.toString());

        //Shift location of P2
        p2.shiftX(5.0);
        p2.shiftY(20.0);
        System.out.print("The point locations after using shift methods are:\n");
        System.out.println(p2.toString());

        //Distance between points
        System.out.printf("This distance from point 1 to point 2 is: %.2f\n",p1.distance(p2));

        //rotate point 1
        p1.rotate(90);
        System.out.println("The point p1 location after rotation is: "+p1.toString());

        //Distance between points after rotation
        System.out.printf("This distance from point 1 to point 2 is: %.2f\n",p1.distance(p2));
        //System.out.println("This distance from"+p1.counter()+ "to point 2 is:"+p1.distance(p2));

    }
}
