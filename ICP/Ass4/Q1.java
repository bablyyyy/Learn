import java.util.*;
class Q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a message: ");
        String s=sc.next();
        int i=1;
        while(i<=10){
            if(i==1) System.out.println(i+"st"+" "+s);
            else if(i==2) System.out.println(i+"nd"+" "+s);
            else if(i==3) System.out.println(i+"rd"+" "+s);
            else{
            System.out.println(i+"th"+" "+s);
            }
            i+=1;
        }
    }
}