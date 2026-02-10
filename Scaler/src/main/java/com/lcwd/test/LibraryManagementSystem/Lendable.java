package com.lcwd.test.LibraryManagementSystem;

public interface Lendable {
    boolean lend(User user);
     boolean returnBook(User user);
     boolean isAvailable();
}
