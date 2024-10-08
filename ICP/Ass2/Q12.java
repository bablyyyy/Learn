import java.util.*;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int gross=n/144;
        n-=gross*144;
        int dozen=n/12;
        n=n-dozen*12;
        int left=n%12;
        System.out.println("Your number of eggs is "+gross+" gross, "+dozen+" dozen, and "+left);
    }
}
