package com.lcwd.test.LibraryManagementSystem;
/*Task 5: Create a Subclass Librarian
Objective: Implement additional subclass-specific functionality.
Step 5.1: Create a subclass Librarian that extends User.
Step 5.2: Add the private attribute String employeeNumber.
Step 5.3: Override the abstract methods:
displayDashboard() should display Librarian Dashboard and the employeeNumber.
canBorrowBooks() should always return true.
Step 5.4: Add methods for librarian-specific actions:
void addNewBook(Book book)
void removeBook(Book book)
Leave implementations as comments for now.
*/
public class Librarian extends User{
private String employeeNumber;

    public Librarian( String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public Librarian(String name, String contactInfo, String employeeNumber) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    public Librarian(User other, String employeeNumber) {
        super(other);
        this.employeeNumber = employeeNumber;
    }

    @Override
    void displayDashboard() {
        System.out.println("Librarian Dashboard");
        System.out.println("Employee Number: " + employeeNumber);
    }
@Override
    boolean canBorrowBooks(){
    return true;
}

 void addNewBook(Book book){
     // Implementation to add a new book to the library system
 }

    void removeBook(Book book){
    // Implementation to remove a book from the library system
    }

}
