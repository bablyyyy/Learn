import java.util.*;
public class Q13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        while(num>0){
            int rem=num%10;
            System.out.print(rem+" ");
            sum+=rem;
            num/=10;
        }
        System.out.println();
        if(sum%9==0){
            System.out.println("The number is divisible by 9");
        }else{
            System.out.println("The number is not divisible by 9");
        }
    }
}
