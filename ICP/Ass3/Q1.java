import java.util.*;
public class Q1{
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double height_cm=sc.nextDouble();
        double height_feet = height_cm *0.0328;
        if(height_feet>6){
            System.out.println("The person is tall.");
        }
        else{
            System.out.println("The person is short.");
        }
       }
}
