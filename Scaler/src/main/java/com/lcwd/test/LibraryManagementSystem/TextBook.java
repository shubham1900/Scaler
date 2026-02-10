package com.lcwd.test.LibraryManagementSystem;
/*Task 4: Create TextBook Class
Objective: Demonstrate inheritance and method implementation.
Step 4.1: Define the TextBook class as a subclass of Book with the following additional attributes:
String subject
int edition
Step 4.2: Add a parameterized constructor to initialize all attributes, including those inherited from Book.
Step 4.3: Override displayBookDetails() to display the textbook's details.
Step 4.4: Test the TextBook class by creating an object and calling its methods.
*/
public class TextBook extends Book {
 public String edition;
 public String subject;


 //parameterized constructor to initialize all attributes, including those inherited from Book.
    public TextBook(String isbn, String tittle, String author, String edition, String subject) {
        super(isbn, tittle, author);
        this.edition = edition;
        this.subject = subject;
    }



    public TextBook(String edition, String subject) {
        this.edition = edition;
        this.subject = subject;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("TextBook Details:");
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + tittle);
        System.out.println("Author: " + author);
        System.out.println("Edition: " + edition);
        System.out.println("Subject: " + subject);
    }
}
