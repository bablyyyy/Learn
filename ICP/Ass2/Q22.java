public class Q22 {
    public static void main(String[] args) {
        int t=Integer.parseInt(args[0]);
        int p=Integer.parseInt(args[1]);
        int r=Integer.parseInt(args[2]);
        double ci=p*Math.exp((r/100)*t);
        double monthly_payment=ci/(t*12);
        System.out.println(monthly_payment);
    }
}
