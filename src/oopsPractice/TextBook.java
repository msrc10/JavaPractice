package oopsPractice;

public class TextBook extends Book{
    String subject;
    int edition;
    public TextBook(String title, String author, String type, String Sub, int edn){
        super(title, author, type);
        this.subject = Sub;
        this.edition = edn;
    }
    @Override
    public void displayBookDetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayBookDetails'");
    }
}
