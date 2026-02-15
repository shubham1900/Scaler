package com.lcwd.test.ScalerQuestions.Thirteenfeb.Q1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable<ArrayList<Integer>> {
    int n;

    public ArrayCreator(int n) {
        this.n = n;


      @Override
    public ArrayList<Integer> call() throws Exception {
        List <Integer> list = new ArrayList<>();
        for(int i=0;i<=n;i++){
            list.add(i);
        }
        return (ArrayList<Integer>) list;
    }
}
