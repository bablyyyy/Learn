import java.util.*;
public class Q8{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int n=sc.nextInt();
        System.out.print("Enter the side: ");
        double side=sc.nextDouble();
        double result=area(n, side);
        System.out.println("The area of the polygon is "+result);
    }
    public static double area(int n, double side){
          double area=(n*(side*side))/(4*Math.tan(3.14/n));
          return area;
    }
}