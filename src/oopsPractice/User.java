package oopsPractice;

public abstract class User {

    public static int totalUsers = 0;
    public final String userId;
    protected String name;
    private String contactInfo;

    /*------------Constructors--------------*/
    User() {
        this.userId = generateUniqueId();
    }

    User(String name, String contactInfo) {
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    User(User old) {
        this.userId = old.userId;
        this.name = old.name;
        this.contactInfo = old.contactInfo;
    }

    /*----------getters and setters----------------*/
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return this.contactInfo;
    }

    public void setContact(String contact) {
        this.contactInfo = contact;
    }

    public static int getTotalUsers() {
        return totalUsers;
    }

    public final String generateUniqueId() {
        return String.valueOf(totalUsers++);
    }

    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();
}
