import java.util.*;
public class Q13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        boolean b=isPalindrome(str);
        System.out.println(b);
    }
    public static boolean isPalindrome(String str){
        str=str.toLowerCase();
        String s="";
         for(int i=str.length()-1;i>=0;i--){
            s=s+str.charAt(i);
         }
         //System.out.println(s);
         if(str.equals(s))  return true;
         else return false;
    }
}
