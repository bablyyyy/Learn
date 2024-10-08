
import java.util.Random;

public class Q15 {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        Random random=new Random();
        int randomNumber = (int)(Math.random() * ((Integer.max(a, b) - Integer.min(a, b)) + 1)) + Integer.min(a, b);
        System.out.println(randomNumber);

    }
}
