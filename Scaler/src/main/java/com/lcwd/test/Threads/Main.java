package com.lcwd.test.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {


            ExecutorService e= Executors.newFixedThreadPool(5);
        for(int i=0; i<100; i++){
                            PrintingNumbers p1 = new PrintingNumbers(i);
            e.execute(p1);
            }
        }

    }
