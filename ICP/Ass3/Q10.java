import java.util.*;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int today=sc.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int days_elapsed=sc.nextInt();

        String days[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        
        int future_day=(days_elapsed + today) % 7;
        System.out.println("Today is "+days[today]+" and the future day is "+days[future_day]);
        
    }
}
