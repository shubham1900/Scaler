package com.lcwd.test.ScalerQuestions.TwelveFeb.Q1;
/***Raw Problem**
 Write code to achieve the following
 A class Client with main method that prints: I am the main class
 Client class should create a new thread and invoke code in a class called Adder.
 The Adder class should print: I am the Adder class
 Client class should create a new thread and invoke code in a class called Subtractor.
 The Subtractor class should print: I am the Subtractor class*/
public class Client {
    public static void main(String[] args) {
        System.out.println("I am the main class");

        Thread adderThread= new Thread(new Adder());
        adderThread.start();

        Thread subtractThread = new Thread (new Subtractor());
        subtractThread.start();
    }


}
