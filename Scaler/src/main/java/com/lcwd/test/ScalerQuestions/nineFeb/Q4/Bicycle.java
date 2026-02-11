package com.lcwd.test.ScalerQuestions.nineFeb.Q4;

public class Bicycle implements Rentable{
    public String bicycleModel;
    public boolean isRented;

    public Bicycle(String bicycleModel) {
        this.bicycleModel = bicycleModel;
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
