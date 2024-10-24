import java.util.*;
public class Q14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        isValid(str);
    }
    public static void isValid(String str){
        int count=0;
        if(str.length()>=8){
           for(int i=0;i<=str.length()-1;i++){
              if((str.charAt(i)>=65 && str.charAt(i)<=90) || (str.charAt(i)>=48 && str.charAt(i)>=57) || (str.charAt(i)>=97 && str.charAt(i)>=122)){
                if(str.charAt(i)>=48 && str.charAt(i)>=57){
                   count++;
                }else{
                    System.out.println("Invalid Password.");
                    return;
                }
                System.out.println("Valid Password.");
                return;
              }
        }
        if(count>=2) System.out.println("Valid Password.");
        else System.out.println("Invalid Password.");
      }else{
        System.out.println("Invalid Password.");
      }
    }
}
