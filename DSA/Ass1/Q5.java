import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        boolean result=isOdd(i);
        System.out.println(result);
    }
    public static boolean isOdd(int i){
        int a=1;
        while(a<=i){
            a+=2;
            if(a==i) return true;
        }
        return false;
    }
}
