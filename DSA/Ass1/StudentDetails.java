import java.util.*;
class Student{
    private String name;
    private int roll;
    private double marks;

    public void setData(){
       Scanner sc=new Scanner(System.in);
       name=sc.next();
       roll=sc.nextInt();
       marks=sc.nextDouble();
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("Marks: "+marks);
        System.out.println();
    }
}
public class StudentDetails {
    public static void main(String[] args) {
        Student student1=new Student();
        Student student2=new Student();
        Student student3=new Student();

        student1.setData();
        student2.setData();
        student3.setData();

        student1.display();
        student2.display();
        student3.display();
    }
}
