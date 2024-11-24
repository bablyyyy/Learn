import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ProductOdd(n, arr);
    }
    public static void ProductOdd(int n, int arr[]) {
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]!=arr[j]){
                    if(arr[i]*arr[j]%2!=0){
                        System.out.println(arr[i]+","+arr[j]+" are two elements with odd products.");
                        return;
                    }
                }
            }
        }
        System.out.println("There is no such pairs.");
    }
}
