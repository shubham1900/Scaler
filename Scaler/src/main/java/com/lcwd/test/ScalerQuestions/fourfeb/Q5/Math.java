package com.lcwd.test.ScalerQuestions.fourfeb.Q5;
/*Q3. Create a Math class - OOPs in Java (Constructors and Static)
Unsolved
Guide for using Scaler IDE to solve Backend problems.
        feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Create a class Math with following requirements
- A class level data member called PI set to 3.14.
        - A class level public method called getCircleArea, which takes as input an integer parameter called radius.
This function should return area of the circle as a double*/
public class Math {

    static double PI=3.14;

    public static double getCircleArea(int radius){
        return PI*radius*radius;
    }
}
