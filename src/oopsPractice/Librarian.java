package oopsPractice;

public class Librarian extends User {

    private String employeeNumber;
    
    public Librarian(String name, String contactInfo, String empNo){
        super(name, contactInfo);
        this.employeeNumber = empNo;
    }

    void addNewBook(Book book) {
        LibraryManagementSystem.bookInventry.add(book);
    }

    void removeBook(Book book) {
        LibraryManagementSystem.bookInventry.remove(book);
    }

    @Override
    public void displayDashboard() {
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }
}
