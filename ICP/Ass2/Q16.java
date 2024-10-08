import java.util.*;
public class Q16 {
    public static void main(String[] args) {
        Random random=new Random();
        int randint1=(int)(Math.random() * Integer.max(1, 6)-Integer.min(1, 6)+1)+Integer.min(1,  6);
        int randint2=(int)(Math.random() * Integer.max(1, 6)-Integer.min(1, 6)+1)+Integer.min(1,  6);
        int sum=randint1+randint2;
        System.out.print(randint1+" ");
        System.out.println(randint2);
        System.out.println(sum);
    }
}
