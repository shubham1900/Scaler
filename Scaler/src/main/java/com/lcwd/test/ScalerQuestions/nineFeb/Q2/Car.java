package com.lcwd.test.ScalerQuestions.nineFeb.Q2;
/*Raw Problem

Write a class Car with following requirements
It should have 2 data-members
Price: int
Speed: int
We should be able to sort a Collection or Array of Cars on price.
Implement required interface for that*/
public class Car implements Comparable<Car> {
    int price;
    int speed;

    public Car(int price, int speed) {
        this.price = price;
        this.speed = speed;
    }

    @Override
    public int compareTo(Car o) {
        return this.price - o.price;
    }

}
