package com.lcwd.test.ScalerQuestions.fourfeb.Q3;
/*Q1. Create a Node Class - OOPs in Java (Constructors)
Unsolved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Create a Node class with following requirements

        Two data members
        i. data : int
ii. next : Node
A constructor which takes an integer parameter. This constructor should set data property and leave the next set to null.
A constructor which takes a Node parameter. This constructor should make a deep copy of the passed node.*/
public class Node {
    int data;
    Node next;

    Node (int data){
        this.data=data;
        this.next=null;
    }
    Node(Node other){
        this.data=other.data;
        if(other.next!=null) {
            this.next = new Node(other.next);
        }
        else{
            this.next=null;
        }
    }
}
