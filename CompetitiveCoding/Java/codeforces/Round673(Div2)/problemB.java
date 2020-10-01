import java.util.*;
import java.io.*;
import java.lang.*;

public class problemB{
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int outer = s.nextInt();
        while (outer-- > 0) {

            int n = s.nextInt();
            int T = s.nextInt();

            boolean negator = true;

            for (int i = 0; i < n; i++) {
                int element = s.nextInt();

                if(T%2 == 0 && element == T/2 ){

                    System.out.print(negator ? "1 ":"0 ");
                    negator = !negator;
                    
                }
                else if(element*2 < T){

                System.out.print(1 + " ");

                }else{

                    System.out.print(0 + " ");

                }
            }
            System.out.println("");
        }
}