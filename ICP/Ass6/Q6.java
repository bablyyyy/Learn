public class Q6 {
    public static void main(String[] args) {
        palindromic_prime();
    }
    public static void palindromic_prime(){
        int count_row=0;
          for(int j=1;j<=1000;j++){
            int count=0;
            for(int k=1;k<=j;k++){
                if(j%k==0) count++;
            }
            if(count<=2){
                int j_after=j;
                int reverse=0;
                while(j_after>0){
                    int rem=j_after%10;
                    reverse=(reverse*10)+rem;
                    j_after/=10;
                }
                if(j==reverse){
                   if(count_row==10){
                      System.out.println(j+" ");
                      count_row=0;
                   }else{
                      System.out.print(j+" ");
                      count_row++;
                   }
                }
            }
            }
    }
}

