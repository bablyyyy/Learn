import java.util.*;
public class Q18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("What is your gender?(M or F) : ");
        char gender=sc.next().charAt(0);
        System.out.print("First name: ");
        String first_name=sc.next();
        System.out.print("Last name: ");
        String last_name=sc.next();
        System.out.print("Age: ");
        int age=sc.nextInt();

        if(gender=='F' || gender=='M'){
            if(age>=20){
                System.out.print("Are you married "+first_name+"? (Y or N)");
                char ans1=sc.next().charAt(0);
                if(ans1=='Y' || ans1=='N'){
                    if(ans1=='Y'){
                      if(gender=='F'){
                      System.out.println("Then I shall call you Mrs. "+first_name+" "+last_name);
                      }else{
                        System.out.println("Then I shall call you Mr. "+first_name+" "+last_name);
                      }
                    }else{
                      if(gender=='F'){
                      System.out.println("Then I shall call you Ms. "+first_name+" "+last_name);
                      }else{
                        System.out.println("Then I shall call you Mr. "+first_name+" "+last_name);
                    }
                }
                }else{
                   System.out.println("Invalid input.");
                }
            }else{
                if(gender=='F')  System.out.println("Then I shall call you Ms. "+first_name+" "+last_name);
                else  System.out.println("Then I shall call you "+first_name+" "+last_name);
            }
        }else{
             System.out.println("Invalid input.");
}
}
}