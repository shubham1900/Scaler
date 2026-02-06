package com.lcwd.test.ScalerQuestions.fourfeb.Q1;
/*Q1. Create a class Point and Rectangle
        Unsolved
        Guide for using Scaler IDE to solve Backend problems.
        feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Create a set of classes to meet the following requirements:

a. Class Point
It should have 2 data-members: x and y.
Add a constructor with two parameters: x and y.
Add a copy constructor.
b. Class Rectangle
It should have 2 data-members:

topLeft (Point)
bottomRight (Point)
Add a constructor with 4 parameters of type int: topLeftX, topLeftY, bottomRightX, bottomRightY.

Add a constructor with 2 parameters of type Point: topLeft, bottomRight.

Add a constructor with 1 parameter of type Rectangle.

Make sure that Rectangle constructors make deep copies.*/
public class Point {
    int x;
    int y;

    public Point(int x,int y) {
        this.x = x;
        this.y=y;
    }
    //Copy constructor
    public Point (Point other){
        this.x=other.x;
        this.y=other.y;
    }

}
