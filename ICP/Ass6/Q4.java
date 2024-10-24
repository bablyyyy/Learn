public class Q4 {
    public static void main(String[] args) {
        for(int i=2000;i<=2020;i++){
            System.out.println(i+" :"+numberOfDaysInAYear(i));
        }
    }
    public static int numberOfDaysInAYear(int year){
        int not_leap=365;
        int leap=366;
        if((year%4==0 && year%100!=0) || year%400==0){
            return leap;
        }else{
            return not_leap;
        }
    }
}
