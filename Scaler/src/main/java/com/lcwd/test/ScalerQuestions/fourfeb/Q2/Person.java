package com.lcwd.test.ScalerQuestions.fourfeb.Q2;
/*Q3. Coding question - Class Constructors - 1A (Basic OOPs)
Unsolved
Guide for using Scaler IDE to solve Backend problems.
        feature icon
Using hints except Complete Solution is Penalty free now
Use Hint


Create a class Person with following requirements

        Should have a data-member age
Should have a data-member name
Should support a constructor with both age and name*/
public class Person {
private int age;
private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        Person p1= new Person(25,"John");
        System.out.println("Name: "+p1.getName());
        System.out.println("Age: "+p1.getAge());
    }
}
