package com.lcwd.test.Threads;

public class PrintingNumbers implements Runnable{
    int x;
    public PrintingNumbers(int x) {
        this.x=x;
    }

    public void run(){
    printNumbers(this.x);
    }
    public void printNumbers(int x){
        System.out.println("Numbers is :" +x + " Thread Name : " + Thread.currentThread().getName());
    }



}
