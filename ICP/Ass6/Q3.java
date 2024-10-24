import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int ans=reverse(number);
        System.out.println(ans);
        boolean ans2=isPalindrome(number);
        System.out.print(ans2);
    }
    public static int reverse(int number){
        int result=0;
        while(number!=0){
           int rem=number%10;
           result=(result*10)+rem;
           number/=10;
        }
        return result;
    }
    public static boolean isPalindrome(int number){
         if(number==reverse(number)){
            return true;
         }else{
            return false;
         }
    }
}
