import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        float radius=sc.nextFloat();
        float length=sc.nextFloat();
        float area = radius * radius * (22.0f/7);
        float volume = area * length;
        System.out.println("The area is "+area);
        System.out.println("The volume is "+volume);
    }
}
