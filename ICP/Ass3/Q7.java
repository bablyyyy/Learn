import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();

        if((x==0 && (y>0 || y<0)) ){
            System.out.println((x+ ", "+y)+" is in y-axis.");
        }else if((x>0 || x<0) && y==0){
            System.out.println((x+ ", "+y)+" is in x-axis.");
        }else if(x>0 && y>0){
            System.out.println((x+ ", "+y)+" is in quadrant I.");
        }else if (x>0 && y<0) {
            System.out.println((x+ ", "+y)+" is in quadrant II.");
        }else if (x<0 && y<0) {
            System.out.println((x+ ", "+y)+" is in quadrant III.");
        }else{
            System.out.println((x+ ", "+y)+" is in quadrant IV.");
        }
    }
}
