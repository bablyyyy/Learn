import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double x=Math.pow(b,2)-4*a*c;
        if(x>0){
            double r1=(-b+Math.pow(x, 0.5))/2*a;
            double r2=(-b-Math.pow(x, 0.5))/2*a;
            System.out.println("The equation has two roots "+r1+" and "+r2);
        }else if(x==0){
            double r1=(-b+Math.pow(x, 0.5))/2*a;
            System.out.println("The equation has one root "+r1);
        }else{
            System.out.println("The equation has no real roots.");
        }
    }
}
