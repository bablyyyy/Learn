import java.util.*;
public class Q14 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    for(int i=0;i<=N;i++){
        if((int)Math.pow(2, i)>N){
            System.out.println((int)Math.pow(2, i-1));
            return;
        }
    }
    }
}
