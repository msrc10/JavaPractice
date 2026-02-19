package oopsPractice;

public abstract class Book implements Lendable{
    String title;
    String Author;
    String type;
    private boolean isAvailable;
    
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
            return true;
        }
        return false;
    }
    
    public boolean isAvailable(){
        return this.isAvailable;
    }
    public abstract void displayBookDetails();
}
