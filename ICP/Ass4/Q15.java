public class Q15 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
               System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        int i=1;
        while (i<=4) { 
            int j=1;
            while(j<=5){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
