import java.util.*;
public class Q14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input1=sc.nextInt();
        int input2=(int)(Math.random()*(Math.max(0, 2)-Math.min(0, 2)+1)-Math.min(0, 2));
  
        int scissor=0;
        int rock=1;
        int paper=2;

        if(input1==scissor){
            if(input2==rock){
                System.out.println("The computer is rock and you are scissor. The computer won.");
            }else if (input2==paper) {
                System.out.println("The computer is paper and you are scissor. You won.");
            }else{
                System.out.println("The computer is scissor and you are scissor too. It is a draw.");
            }
        }
        if(input1==rock){
            if(input2==scissor){
                System.out.println("The computer is scissor and you are rock. You won.");
            }else if (input2==paper) {
                System.out.println("The computer is paper and you are rock. The computer own.");
            }else{
                System.out.println("The computer is rock and you are rock too. It is a draw.");
            }
        }
        if(input1==paper){
            if(input2==scissor){
                System.out.println("The computer is scissor and you are paper. The computer won.");
            }else if (input2==rock) {
                System.out.println("The computer is rock and you are paper. You own.");
            }else{
                System.out.println("The computer is paper and you are paper too. It is a draw.");
            }
        }
    }
    }

