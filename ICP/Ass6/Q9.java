import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();
        System.out.print("Enter c: ");
        int c=sc.nextInt();
        System.out.print("Enter d: ");
        int d=sc.nextInt();
        fraction(a, b, c, d);
    }
    public static void fraction(int a,int b,int c,int d){
        int e=(a*d)+(c*b);
        int f=(b*d);
        System.out.println(e+"/"+f); 
    }
}
