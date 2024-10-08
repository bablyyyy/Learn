import java.util.*;
public class Q13 {
    public static void main(String[] args) {
        System.out.println("Enter the number of minutes: ");
        Scanner sc=new Scanner(System.in);
        int minutes=sc.nextInt();
        int years=minutes/(365*1440);
        minutes=minutes-(years*365*1440);
        int days=minutes/(1440);
        System.out.println(minutes+" is approximately "+years+" years and "+days+" days.");
    }
}
