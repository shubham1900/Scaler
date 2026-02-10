package com.lcwd.test.LibraryManagementSystem;
/*Task 4: Create a Subclass Member
Objective: Implement inheritance and method overriding.
Step 4.1: Create a concrete subclass Member that extends User.
Step 4.2: Add the following private attributes:
int borrowedBooksCount
A constant MAX_BORROW_LIMIT = 5
Step 4.3: Override the abstract methods:
displayDashboard() should display Member Dashboard and Books Borrowed: X.
canBorrowBooks() should return true if borrowedBooksCount < MAX_BORROW_LIMIT.
Step 4.4: Add constructors to initialize Member.*/
public class Member extends User {

    Member(){
        super();
        this.borrowedBooksCount=0;
    }
    Member(String name,String contactInfo){
        super(name,contactInfo);
        this.borrowedBooksCount=0;
    }
     Member(Member other){
        super(other);
        this.borrowedBooksCount=other.borrowedBooksCount;
    }

    private int borrowedBooksCount;

    private static final int MAX_BORROW_LIMIT = 5;


    @Override
    void displayDashboard() {
        System.out.println("Member Dashboard");
        System.out.println("Books Borrowed: " + borrowedBooksCount);
    }

    @Override
    boolean canBorrowBooks() {
        if (borrowedBooksCount < MAX_BORROW_LIMIT) {
            return true;
        }
        return false;
    }
}
