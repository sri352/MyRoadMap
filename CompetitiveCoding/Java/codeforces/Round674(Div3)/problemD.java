import java.util.*;
import java.io.*;
import java.lang.*;
 
public class problemD{
    public static void main(String[] args) throws IOException {
    
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int[] arr = new int[n];
       
       for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
       }
       
       HashMap<Long,Integer> map = new HashMap<>();
       
       long currsum = 0;
       int sum = 0;
       int res = 0;
 
       for(int i=0;i<n;i++){
       
           currsum = currsum+arr[i];
           
           if(map.containsKey(currsum) || currsum==0){
                res++;
                map=new HashMap<>();
                currsum=arr[i];
           }
           
           map.put(currsum,1);
       }
       System.out.println(res);

    }
   
}