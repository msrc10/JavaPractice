package oopsPractice;

public class Member extends User {

    private int borrowedBooksCount;
    private final int MAX_BORROW_LIMIT = 1;

    public Member(String name, String contactInfo, int bookscnt) {
        super(name, contactInfo);
        this.borrowedBooksCount = bookscnt;
    }

    @Override
    public void displayDashboard() {
    }

    @Override
    public boolean canBorrowBooks() {
        return this.borrowedBooksCount < MAX_BORROW_LIMIT;
    }
}
