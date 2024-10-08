public class Q19 {
    public static void main(String[] args) {
        double salary=Integer.parseInt(args[0]);
        double dearness_allowance=salary*0.4;
        double house_rent_allowance=salary*0.2;
        double gross_salary=salary+dearness_allowance+house_rent_allowance;
        System.out.println(gross_salary);
    }
}
