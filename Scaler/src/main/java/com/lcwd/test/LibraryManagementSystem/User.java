package com.lcwd.test.LibraryManagementSystem;

public abstract class User {

    private static int idCounter = 0;
    private static int totalUsers=0;
    private final String userId;
    private String name;
    private String contactInfo;

    // Default constructor to generate unique userId
    public User() {
        this.userId = generateUniqueId();
        totalUsers++;
    }
    public User(String name,String contactInfo){
        this.userId=generateUniqueId();
        this.name=name;
        this.contactInfo=contactInfo;
            totalUsers++;
    }
    public User(User other){
        this.userId=other.userId;
        this.name=other.name;
        this.contactInfo=other.contactInfo;
        totalUsers++;
    }
    public final static String generateUniqueId(){
        return String.valueOf(++idCounter);
    }
    abstract void displayDashboard();
    abstract boolean canBorrowBooks();








    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }



}
