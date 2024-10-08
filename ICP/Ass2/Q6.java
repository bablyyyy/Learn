import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight=sc.nextDouble();
        System.out.print("Enter height in inches: ");
        double height=sc.nextDouble();

        weight=weight * 0.45359237;
        height=height * 0.0254;

        double bmi=weight/(height * height);
        System.out.println("BMI is "+bmi);
    }
}
