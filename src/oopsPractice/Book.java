package oopsPractice;

public abstract class Book implements Lendable{
    String title;
    String Author;
    String type;
    private boolean isAvailable;
    private String user;
    
    Book(String title, String Author, String type){
        this.title = title;
        this.Author = Author;
        this.type = type;
        this.isAvailable = true;
    }
    
    @Override
    public boolean lend(User user){
        if(isAvailable){
            this.isAvailable = false;
            this.user = user.name;
            return true;
        }
        return false;
    }

    @Override
    public void returnBook(User user){
        this.user = "";
        this.isAvailable = true;
    }
    
    public boolean isAvailable(){
        return this.isAvailable;
    }
    public abstract void displayBookDetails();
}
