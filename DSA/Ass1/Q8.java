
import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n];
        
        for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
         }
         int[] result=dotProduct(n, a, b, c);
        System.out.println(Arrays.toString(result));
        
    }
    public static int[] dotProduct(int n, int a[], int b[], int c[]){
        int i=0;
        while(i<n){
            c[i]=a[i]*b[i];
            i++;
           }
           return c;
        }
}
