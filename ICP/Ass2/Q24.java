public class Q24 {
    public static void main(String[] args) {
        double sum=0;
        double min=1;
        double max=0;
        for(int i=1;i<=5;i++){
            double x=Math.random();
            System.out.println("random_number"+i+" : "+x);
            min=Math.min(min,x);
            max=Math.max(max,x);
            sum+=x;
        }
         double avg=sum/5;
         System.out.println("The average is : "+avg);
         System.out.println("The minimum value is : "+min);
         System.out.println("The maximum value is : "+max);
    }
}
