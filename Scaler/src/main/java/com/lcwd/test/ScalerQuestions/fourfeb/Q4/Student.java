package com.lcwd.test.ScalerQuestions.fourfeb.Q4;
/*Q2. Create a student Class - OOPs in Java (Constructors)
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Create a class Student with following requirements

        Two data members
        age : int
name : String
Four constructors
Default constructor : Should set age to 0 and name to null
Constructor with int parameter : Should set age to the passed parameter and name to null
Constructor with String parameter : Should set name to the passed parameter and age to 0
Constructor with two parameters - int and String : Should set the age to int parameter and name to String parameter
The assignment code should only be in the 4th constructor. The top 3 constructors should use telescoping to invoke the 4th constructor.*/
public class Student {
    private int age;
    private String name;

    public Student() {
        this(0, null);
    }

    public Student(int age) {
        this(age, null);
    }

    public Student(String name) {
        this(0, name);
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
