public class Q23 {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        int sum=a+b+c;
        int x=Math.min(a,Math.min(b,c));
        int y=Math.max(a,Math.max(b,c));
        System.out.println(x+" "+(sum-(x+y))+" "+y);
    }
}
