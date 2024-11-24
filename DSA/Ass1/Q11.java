class Point{
    double x;
    double y;

    public void setPoint(double x, double y){
        this.x=x;
        this.y=y;
    }

    public static double findDistance(Point p1, Point p2){
        double xx = p2.x - p1.x;
        double yy = p2.y - p1.y;
        double distance = Math.sqrt((xx * xx)+(yy * yy));
        return distance;
    }
}
public class Q11 {
    public static void main(String[] args) {
        Point p1=new Point();
        Point p2=new Point();

        p1.setPoint(2, 3);
        p2.setPoint(4, 7);

        double distance=Point.findDistance(p1, p2);
        System.out.println(distance);
    }
}
