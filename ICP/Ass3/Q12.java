import java.util.*;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();

        if((x<y) && (y<z)){
            System.out.println(x+" "+y+" "+z);
        }else if((x<y) && (y>z) && (x>z)){
            System.out.println(z+" "+x+" "+y);
        }else if((x<y) && (y>z) && (x<z)){
            System.out.println(x+" "+z+" "+y);
        }else if((x>y) && (y>z)){
            System.out.println(z+" "+y+" "+x);
        }
    }
}
