import java.util.*;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.next();
        System.out.print("Enter a character: ");
        char a=sc.next().charAt(0);
        int result=count(str, a);
        System.out.println(result);

    }
    public static int count(String str, char a){
        int n=str.length();
        int count=0;
        for(int i=0;i<=n-1;i++){
            if(str.charAt(i)==a){
               count++;
            }
        }
        return count;
    }
}
