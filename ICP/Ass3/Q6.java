import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        System.out.print("Enter a, b, c, d, e, f :");
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        double e=sc.nextDouble();
        double f=sc.nextDouble();

        if((a*d)-(b*c)==0){
            System.out.println("The equation has no solution.");
        }else{
            double x=((e*d)-(b*f))/((a*d)-(b*c));
            double y=((a*f)-(e*c))/((a*d)-(b*c));
            System.out.println("x is "+x+" and y is "+y);
        }
    }
}
