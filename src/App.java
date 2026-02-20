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
        

        LibraryManagementSystem LMS = new LibraryManagementSystem();
        
        TextBook txtbook = new TextBook("mathsforeveryone","ramu","SDE","maths",2);
        NovelBook nbook = new NovelBook("Intelligent","Ram","normal","comedy");
        
        LMS.addBook(txtbook);
        LMS.addBook(nbook);
        
        Member Gannu = new Member("ganesh","Hyd",2);
        Member Ram = new Member("ramu","atp",5);
        Librarian librarian = new Librarian("Mohan","Atp","1");
        
        LMS.registerUser(Gannu);
        LMS.registerUser(Ram);
        LMS.registerUser(librarian);

        System.out.println(LibraryManagementSystem.bookInventry);
        System.out.println(LibraryManagementSystem.registeredUsers);

        boolean success = txtbook.lend(Gannu);
        System.out.println(success);

        boolean Suc = txtbook.lend(Ram);
        System.out.println(Suc);

        txtbook.returnBook(Gannu);

        boolean Succ = txtbook.lend(Ram);
        System.out.println(Succ);
        
    }
}
