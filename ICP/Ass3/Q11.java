import java.util.*;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double weight_in_kg=sc.nextDouble();
        double height_in_m=sc.nextDouble();

        double bmi=weight_in_kg/Math.pow(height_in_m,2);
        
        if(bmi<18.5){
            System.out.println("underweight");
        }else if(bmi>18.5 && bmi<24.9){
            System.out.println("normal weight");
        }else if(bmi>25.0 && bmi<29.0){
            System.out.println("overweight");
        }else{
            System.out.println("obese");
        }
    }
}
