import java.util.*;
import java.io.*;
import java.lang.*;

public class problemA{
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int outer = s.nextInt();
        while(outer-->0){
            int n = s.nextInt();
            int k = s.nextInt();

            int[] arr = new int[n];
            int min=Integer.MAX_VALUE;
            int index = 0;

            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
                min = Math.min(min,arr[i]);
                if(arr[i]==min){index = i;}
            }

            long ans=0;

            for(int i=0;i<n;i++){
                if(i!=index){
                    ans = ans + (Math.max((k-arr[i]),0)/min);
                }
            }
            System.out.println(ans);
        }
    }
}