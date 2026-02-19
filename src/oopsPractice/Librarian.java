package oopsPractice;

public class Librarian extends User {

    private String employeeNumber;
    
    public Librarian(String empNo){
        this.employeeNumber = empNo;
    }

    void addNewBook(Book book) {
    }

    void removeBook(Book book) {
    }

    @Override
    public void displayDashboard() {
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }
}
