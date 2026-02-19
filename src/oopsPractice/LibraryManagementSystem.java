package oopsPractice;
import java.util.*;
import java.io.*;

public class LibraryManagementSystem{
    public static ArrayList<Book> bookInventry;
    public ArrayList<User> registeredUsers;
    
    public LibraryManagementSystem(ArrayList<Book> books, ArrayList<User> users){
        this.bookInventry = books;
        this.registeredUsers = users;
    }
    
    public void addBook(Book book){
        bookInventry.add(book);
    }
    
    public void registerUser(User user){
        registeredUsers.add(user);
    }
    
    public  static ArrayList<Book> SearchBooks(String Criteria){
        ArrayList<Book> result = new ArrayList<>();
        
        for(Book b: bookInventry){
            if(b.title.equals(Criteria) || b.Author.equals(Criteria)){
                result.add(b);
            }
        }
        return result;
    }
    
    public static ArrayList<Book> SearchBooks(String Criteria,
                                              String type){
        ArrayList<Book> result = new ArrayList<>();
        
        for(Book b: bookInventry){
            if(b.type == type && (b.title.equals(Criteria) || b.Author.equals(Criteria))){
                result.add(b);
            }
        }
        return result;
    }
}
