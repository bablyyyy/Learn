public class Q7 {
    public static void main(String[] args) {
        for(int i=1;i<=1000;i++){
           if(isPrime(i) && isPrime(i+2)){
              System.out.println("("+i+","+(i+2)+")");
           }
        }
    }
    public static boolean isPrime(int number){
        int count=0;
        for(int i=1;i<=number;i++){
           if(number%i==0) count++;
        }
        return count<=2;
    }
}
