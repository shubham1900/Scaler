package com.lcwd.test.LibraryManagementSystem;
/*Task 5: Create NovelBook Class
Objective: Implement another concrete subclass to explore different book types.
Step 5.1: Define the NovelBook class as a subclass of Book with the additional attribute:
String genre
Step 5.2: Add a parameterized constructor to initialize all attributes, including those inherited from Book.
Step 5.3: Override displayBookDetails() to display the novel's details.
Step 5.4: Test the NovelBook class by creating an object and calling its methods.
*/
public class NovelBook extends Book {
    public String genre;

    NovelBook(String isbn, String tittle, String author, String genre) {
        super(isbn, tittle, author);
        this.genre = genre;
    }

     NovelBook(String genre) {
        this.genre = genre;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("NovelBook Details:");
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + tittle);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
    }
}
