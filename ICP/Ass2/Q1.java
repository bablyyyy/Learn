import java.util.Scanner;
public class Q1{
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a degree in celsius: ");
        double celsius=sc.nextDouble();

        double fahrenheit=(9.0 / 5) * celsius + 32;
        System.out.println(celsius+" celsius is "+fahrenheit+" degree fahrenheit.");
      }
}