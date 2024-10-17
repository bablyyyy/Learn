public class Q12 {
    public static void main(String[] args) {
        for(int i=16;i<=2048;i*=2){
            System.out.println((int)Math.log(i) + "\t" + i + "\t" + i*(int)Math.log(i) + "\t" +
            (int)Math.pow(i,2) + "\t" + (int)Math.pow(i,3) + "\t" + (int)Math.pow(2,i));
        }
    }
}
