class StudentDetails{
    private String name;
    private int roll;
    private double marks;

    public void setData(String name, int roll, double marks){
        this.name=name;
        this.roll=roll;
        this.marks=marks;

    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("Marks: "+marks);
        System.out.println();
    }
}

public class Q10{
     public static void main(String[] args) {
           StudentDetails s1=new StudentDetails();
           StudentDetails s2=new StudentDetails();
           StudentDetails s3=new StudentDetails();

            s1.setData("Hello", 123, 88.2);
            s2.setData("Honney", 143, 93.2);
            s3.setData("Bunny", 126, 72.4);

            s1.display();
            s2.display();
            s3.display();
         }
    }
