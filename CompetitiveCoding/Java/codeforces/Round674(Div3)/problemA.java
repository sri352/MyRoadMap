mport java.util.*;
import java.io.*;
import java.lang.*;
 
public class problemA{
    public static void main(String[] args) throws IOException {
    
       Scanner s = new Scanner(System.in);
       int outer = s.nextInt();
       
       while(outer-->0){
           int n = s.nextInt();
           int x = s.nextInt();
           
           if(n==1 || n==2){
               System.out.println(1);
               continue;
           }
           int floor = 2;
           while((floor-1) * x + 3 <= n){
               floor++;
           }
           System.out.println(floor);
           
           
           
           
       }
       
    }
      
   
}