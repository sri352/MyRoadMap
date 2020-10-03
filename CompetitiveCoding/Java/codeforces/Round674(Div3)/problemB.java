import java.util.*;
import java.io.*;
import java.lang.*;
 
public class problemB{
    public static void main(String[] args) throws IOException {
    
       Scanner s = new Scanner(System.in);
       int outer = s.nextInt();
       
       while(outer-->0){
           int n = s.nextInt();
           int m = s.nextInt();
            
           boolean ifSymm = false;
           while(n-->0){
               int a = s.nextInt();
               int b = s.nextInt();
               int c = s.nextInt();
               int d = s.nextInt();
               if(b == c){
                   ifSymm = true;
               }
           }
 
           if(m%2!=0){
               ifSymm=false;
           }
           
           System.out.println(abc ? "YES": "NO");
           
           
       }
       
    }
}