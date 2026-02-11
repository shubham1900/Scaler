package com.lcwd.test.ScalerQuestions.nineFeb.Q4;

public class Car implements Rentable {
    public String carModel;
    public boolean isRented;

    public Car(String carModel) {
        this.carModel = carModel;
        this.isRented = false;
    }

    @Override
    public void rent() {
        if (!isRented) {
            isRented = true;
        }
    }

    @Override
    public void returnItem() {
        if (isRented) {
            isRented = false;
        }
    }
}
