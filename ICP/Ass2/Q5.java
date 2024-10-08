import java.util.*;
public class Q5 {
    public static void main(String args[]){
        System.out.print("Enter v0, v1 and t: ");
        Scanner sc=new Scanner(System.in);
        double v0=sc.nextDouble();
        double v1=sc.nextDouble();
        double t=sc.nextDouble();
        double a=(v0-v1)/t;
        System.out.println("The average accelaration is "+a);
    }

}
