package com.lcwd.test;

public class Student {
    //data
    int studentId;
    String name;
    String email;
    int age;
    String universityName;


    //behavior
    public void attendClass(){
        System.out.println(name+ "is attending class");

    }
    public  void  solveAssignment(String assignment){
        System.out.println(name+ "is solving"+ assignment);
    }

}
