import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x1 and y1: ");
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        System.out.print("Enter x2 and y2: ");
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();

        double distance=Math.pow((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1), 0.5);
        System.out.println("The distance between the two points is "+distance);
    }
}
