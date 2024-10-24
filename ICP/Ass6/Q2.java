import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=getPentagonalNumber(n);
        System.out.print(result);

        listOfPentagon();
    }
    public static int getPentagonalNumber(int n){
        return (n*(3*n-1))/2;
    }
    public static void listOfPentagon(){
           for (int i = 1; i < 100; i++) {
               if(i%10==0){
               System.out.println(getPentagonalNumber(i)+" ");
               }else{
                System.out.print(getPentagonalNumber(i)+" ");
               }
           }
    }
}
