
public class Q2 {
    public static void main(String[] args) {
        int num=Integer.parseInt(args[0]);

        if(num>1000 || num<=0){
            System.out.println("Please enter valid number.");
        }else{
            for(int i=1;i<=num;i++){
                if((i%10==1 || i%100==1) && i!=11){
                    System.out.println(i+"st Hello");
                }else if((i%10==2 || i%100==2) && i!=12){
                    System.out.println(i+"nd Hello");
                }else if ((i%10==3 || i%100==3) && i!=13) {
                    System.out.println(i+"rd Hello");
                }else{
                    System.out.println(i+"th Hello");
                }
            }
        }
    }
}
