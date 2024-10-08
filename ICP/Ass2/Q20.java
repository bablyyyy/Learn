public class Q20 {
    public static void main(String[] args) {
        int m=Integer.parseInt(args[0]);
        int d=Integer.parseInt(args[1]);
        if((m==4 && d>=1 && d<=30) || (m==5 && d>=1 && d<=31)){
            System.out.println("True");
        }
        else if ((m==3 && d<=20 && d>=31) || (m==6 && d>=1 && d<=20) ) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
