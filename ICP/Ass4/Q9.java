public class Q9 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=3;i<=10;i++){
           if((i%3==0) && (i%5==0)){
             sum+=i;
           }else if(((i%3==0) || (i%5==0)) && (i%3!=0 || i%5!=0)){
             sum+=i;
           }
        }
        System.out.println(sum);
    }
}
