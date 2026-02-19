import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        long b = sc.nextLong();
        String s = sc.next();
        Character ch = sc.next().charAt(0);
        sc.nextLine();/*fix*/
        String line = sc.nextLine(); 

        
        System.out.println(a + " " + b + " " + s + " " + ch + " " + line );
        
    }
}
