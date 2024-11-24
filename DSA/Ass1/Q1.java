import java.util.*;
public class Q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();
        System.out.print("Enter c: ");
        int c=sc.nextInt();
        isArithmetic(a, b, c);
    }
    public static void isArithmetic(int a, int b, int c){
        if((a+b)==c){
            System.out.println("a+b=c is correct.");
        }else if(a==(b-c)){
            System.out.println("a=b-c is correct.");
        }else if((a*b)==c){
            System.out.println("a*b=c is correct.");
        }else{
            System.out.println("None of the arithmetic expression is correct.");
        }
    }
}