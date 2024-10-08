import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        System.out.print("Enter the side: ");
        Scanner sc=new Scanner(System.in);
        double side=sc.nextDouble();
        double area=((3 * Math.sqrt(3))/2) * (side * side);
        System.out.println("The area of the hexagon is "+area);
    }
}
