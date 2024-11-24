public class Q2 {
    public static void main(String[] args) {
      int num=8;  
      int result=NoOfTimes(num);
      System.out.println(result);
    }
    public static int NoOfTimes(int num){
       int count=0;
       while(num>=2){
          num=num/2;
          count++;
       }
       return count;
    }
}
