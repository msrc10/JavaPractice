package oopsPractice;

public class Member extends User {

    private int borrowedBooksCount;
    private final int MAX_BORROW_LIMIT = 5;

    public Member(int bookscnt) {
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
