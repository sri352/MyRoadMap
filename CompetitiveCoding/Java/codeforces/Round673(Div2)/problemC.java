import java.util.*;
import java.io.*;
import java.lang.*;
 
public class problemC{
    public static void main(String[] args) throws IOException {
    BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
    int outer = Integer.parseInt(inputReader.readLine());
 
       while(outer-->0){
           int n = Integer.parseInt(inputReader.readLine());

           int[] f = new int[n+2];
           int[] last = new int[n+2];
           int[] arr = new int[n+2];
           int[] ans = new int[n+2];
           
           for (int i = 1; i <= n; i++) {
                f[i] =0;
                last[i] = 0;
                ans[i] = -1;
            }
           
           StringTokenizer st = new StringTokenizer(inputReader.readLine());
           
           for(int i=1;i<=n;i++){
               arr[i] = Integer.parseInt(st.nextToken());  //taking the input from the array
           }
           
           
           
           for (int i = 1; i <= n; ++i) {
                int x = arr[i];
                f[x] = Math.max(f[x], i - last[x]);  // i-last[x] is the difference in distance  
                last[x] = i; //f[x] is the max difference between two same elements
            }
            
            StringBuilder stringans = new StringBuilder();
            for (int x = 1; x <= n; ++x) {
                 f[x] = Math.max(f[x], n - last[x] + 1); //condition to check for the very last occurence in the array
    
                for (int i = f[x]; i <= n && ans[i] == -1; ++i) {
                     ans[i] = x;  
                }
            }
            
            for (int i = 1; i <= n; ++i) {
                stringans.append(ans[i] +" ");
            }
           
            System.out.println(stringans.toString().trim());
       }
       
    }
      
   
}