public class Q8 {
    public static void main(String[] args) {
        String x="1";
        System.out.println(x);
        for(int i=2;i<=5;i++){
           System.out.println(x+i+x);
           x= x+i+x;
        }
    }
}