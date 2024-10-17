import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Count from: ");
        int count_from=sc.nextInt();
        System.out.print("Count to: ");
        int count_to=sc.nextInt();
        System.out.print("Count by: ");
        int count_by=sc.nextInt();

        for(int i=count_from;i<=count_to;i+=count_by){
            System.out.print(i+" ");
        }
    }
}
