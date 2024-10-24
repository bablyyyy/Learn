import java.util.*;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter ch1: ");
        char ch1=sc.next().charAt(0);
        System.out.print("Enter ch2: ");
        char ch2=sc.next().charAt(0);
        System.out.print("Enter numberPerLine: ");
        int numberPerLine=sc.nextInt();
        printChars(ch1, ch2, numberPerLine);

    }
    public static void printChars(char ch1, char ch2, int numberPerLine){
        int count=0;
           for(char i=ch1;i<=ch2;i++){
               if(count==numberPerLine){
                System.out.println(i+" ");
                count=0;
               }else{
                System.out.print(i+" ");
                count++;
               }
           }
    }
}
