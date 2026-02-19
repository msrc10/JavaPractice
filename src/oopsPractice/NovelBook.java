package oopsPractice;

public class NovelBook extends Book {
    protected String genre;

    public NovelBook(String title, String author, String type, String genre) {
        super(title, author, type);
        this.genre = genre;
    }

    @Override
    public void returnBook(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'returnBook'");
    }

    @Override
    public void displayBookDetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayBookDetails'");
    }
}

