import java.util.*;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.next();
        int result=count(str);
        System.out.println(result);
    }
    public static int count(String str){
        int count=0;
        for(char i=0;i<=str.length()-1;i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
}
