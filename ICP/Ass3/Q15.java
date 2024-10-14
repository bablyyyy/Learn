import java.util.*;
public class Q15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();

        double distance=Math.pow(Math.pow((x-0),2)+Math.pow((y-0),2), 0.5);

        if(distance<=10.0){
            System.out.println("Point ("+x+","+y+") is in the circle.");
        }else{
            System.out.println("Point ("+x+","+y+") is not in the circle.");
        }
    }
}
