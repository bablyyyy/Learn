import java.util.*;
public class Q17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num=sc.nextInt();

        if(num%5==0 && num%6==0){
            System.out.println("Is it divisible by 5 and 6?"+" True");
        }else{
            System.out.println("Is it divisible by 5 and 6?"+" False");
        }

        if(num%5==0 || num%6==0){
            System.out.println("Is it divisible by 5 or 6?"+" True");
        }else{
            System.out.println("Is it divisible by 5 and 6?"+" False");
        }

        if((num%5==0 || num%6==0) && (num%5!=0 || num%6!=0)){
            System.out.println("Is it divisible by 5 or 6, but not both?"+" True");
        }else{
            System.out.println("Is it divisible by 5 or 6, but not both?"+" False");
        }
    }
}
