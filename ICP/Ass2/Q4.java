import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        System.out.print("Enter a number netween 0 and 1000: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>1000 || num<0){
           return;
        }
        int sum=0;
        int x;
        for(int i=1;i<=4;i++){
        x=num%10;
        sum+=x;
        num=num/10;
        }
        System.out.println("The sum of the digits is "+sum);
    }
}
