public class Q11 {
    public static void main(String[] args) {
        int sum1=0;
        int sum2=0;

        for(int i=1;i<=10;i++){
            sum1+=(int)Math.pow(i, 2);
            sum2+=i;
        }
        sum2=sum2*sum2;
        System.out.println("The sum of the squares of the first ten natural numbers is: "+sum1);
        System.out.println("The square of the sum of the first ten natural numbers is: "+sum2);

        int difference=sum2-sum1;
        System.out.println("Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is "+difference);
    }
}
