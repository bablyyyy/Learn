import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch<=90 && ch>=65){
            System.out.println("It is a capital letter.");
        }
        else if (ch<=122 && ch>=97) {
            System.out.println("It is a small case letter.");
        }else if (ch<=48  && ch>=57 ) {
            System.out.println("It is a digit.");
        }else{
            System.out.println("It is a special symbol.");
        }
    }
}
