import java.util.*;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double investmentAmount=sc.nextDouble();
        double AnualInterestRate=sc.nextDouble();
        int NoOfyears=sc.nextInt();

        double futureInvestmentValue = investmentAmount * Math.pow((1 + AnualInterestRate/(12*100)), (NoOfyears*12));
        System.out.println(futureInvestmentValue) ;   
    }
}
