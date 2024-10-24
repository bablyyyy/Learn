public class Q1{
    public static void main(String[] args) {
        int x=2;
        int y=8;
        int n=9;
        int m=2;
        int ans1=additionSimple(x, y);
        System.out.println(ans1);
        int ans2=subtractionSimple(x, y);
        System.out.println(ans2);
        int ans3=multiplicationSimple(x, y);
        System.out.println(ans3);
        int ans4=divisionSimple(x, y);
        System.out.println(ans4);
        int ans5=remainderSimple(n, m);
        System.out.println(ans5);
        double ans6=squareRootSimple(n);
        System.out.println(ans6);
    }
    public static int additionSimple(int x, int y){
        return x+y;
    }
    public static int subtractionSimple(int x, int y){
        return y-x;
    }
    public static int multiplicationSimple(int x, int y){
        return x*y;
    }
    public static int divisionSimple(int x, int y){
        if(x!=0){
            return y/x;
        }else{
            return -1;
        }
    }
    public static int remainderSimple(int n, int m){
        return n%m;
    }
    public static double squareRootSimple(int n){
        return Math.pow(n, n);
    }
}