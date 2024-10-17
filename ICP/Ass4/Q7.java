public class Q7 {
    public static void main(String[] args) {
        int N=Integer.parseInt(args[0]);
        
        double sum=0.0;
        for(int i=0;i<N;i++){
            sum+=Math.random()*((Math.max(0, 1)-Math.min(0, 1)+1)-Math.min(0, 1));
        }
        double avg=sum/N;
        System.out.println(avg);
    }
}
