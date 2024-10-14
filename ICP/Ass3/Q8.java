import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int rahul_age=sc.nextInt();
        int ayush_age=sc.nextInt();
        int ajay_age=sc.nextInt();

        if ((rahul_age>ayush_age) && (rahul_age>ajay_age)) {
            System.out.println("Rahul is eldest.");
        }else if((ayush_age>rahul_age) && (ayush_age>ajay_age)){
            System.out.println("Ayush is eldest.");
        }else{
            System.out.println("Ajay is eldest.");
        }
    }
}
