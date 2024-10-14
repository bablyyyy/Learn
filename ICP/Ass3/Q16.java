import java.util.*;
public class Q16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        marks/=10;

        switch(marks){
            case 9:
                System.out.println("Grade O");
                break;
            case 8: 
                System.out.println("Grade A");
                break;
            case 7:
                System.out.println("Grade B");
                break;
            case 6:
                System.out.println("Grade C");
                break;
            case 5:
                System.out.println("Grade D");
                break;
            case 4:
                System.out.println("Grade E");
                break;
            default:
                System.out.println("Grade F");
                break;
        }
    }
}
