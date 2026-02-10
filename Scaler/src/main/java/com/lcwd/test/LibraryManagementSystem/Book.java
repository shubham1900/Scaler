package com.lcwd.test.LibraryManagementSystem;
/*Task 2: Implement the Abstract Book Class
Objective: Explore abstract classes, encapsulation, and method overriding.
Step 2.1: Create the Book class that implements Lendable. Add the following private attributes:
String isbn
String title
String author
boolean isAvailable
Step 2.2: Implement the methods from Lendable:
lend(User user): If the book is available and the user can borrow, mark the book as unavailable and return true.
returnBook(User user): Mark the book as available.
isAvailable(): Return the availability status.
Step 2.3: Explain why the class is abstract and add an abstract method void displayBookDetails().

Task 3: Add Constructors to the Book Class
Objective: Practice constructor overloading and copying.
Step 3.1: Add the following constructors:
A default constructor that initializes isAvailable to true.
A parameterized constructor to initialize isbn, title, and author.
A copy constructor to create a new Book object from an existing one.
Step 3.2: Test the constructors by creating objects using each constructor.

*/
public abstract class Book implements Lendable {
    String isbn;
    String tittle;
    String author;
    boolean isAvailable;

    public Book () {
        this.isAvailable = true;
    }
    public Book(String isbn, String tittle, String author) {
        this.isbn = isbn;
        this.tittle = tittle;
        this.author = author;
        this.isAvailable = true;
    }
    public Book(Book other) {
        this.isbn = other.isbn;
        this.tittle = other.tittle;
        this.author = other.author;
        this.isAvailable = other.isAvailable;
    }

    @Override
    public boolean lend(User user) {
        if(isAvailable && user.canBorrowBooks()) {
            isAvailable = false;
            return true;
        }
        return false;
    }
    public boolean returnBook(User user) {
        isAvailable = true;
        return true;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public abstract void displayBookDetails();
}
