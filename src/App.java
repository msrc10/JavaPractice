import java.util.*;
import oopsPractice.*;
import java.io.*;

public class App {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
        // long b = sc.nextLong();
        // String s = sc.next();
        // Character ch = sc.next().charAt(0);
        // sc.nextLine();/*fix*/
        // String line = sc.nextLine(); 

        
        // System.out.println(a + " " + b + " " + s + " " + ch + " " + line );
        
        ArrayList<Book>bookList = new ArrayList<Book>();
        ArrayList<User>userList = new ArrayList<User>();

        LibraryManagementSystem LMS = new LibraryManagementSystem(bookList,userList);
        
        TextBook txtbook = new TextBook("maths","isbn","title","author",2);
        NovelBook nbook = new NovelBook("comedy","is","tit","auth");
        
        LMS.addBook(txtbook);
        LMS.addBook(nbook);
        
        Member member = new Member(5);
        Librarian librarian = new Librarian("1");
        
        LMS.registerUser(member);
        LMS.registerUser(librarian);
        
    }
}
