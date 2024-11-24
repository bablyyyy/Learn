

class Flower{
    private String name;
    private int petals;
    private double price;

    public void initialise(String name, int petals, double price){
        this.name=name;
        this.petals=petals;
        this.price=price;
    } 
    public void setName(String name){
        this.name=name;
    }
    public void setPetals(int petals){
        this.petals=petals;
    }
    public void setPrice(double price){
        this.price=price;
    }
    
    public String getName(String name){
        return name;
    }
    public int getPetals(int petals){
        return petals;
    }
    public double getPrice(double price){
        return price;
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("NUmber of petals: "+petals);
        System.out.println("price: "+price);
        System.out.println();
    }
}
public class Q12 {
    public static void main(String[] args) {
        Flower flower = new Flower();
        flower.initialise("Lily", 4, 8);
        flower.display();

        flower.setName("rose");
        flower.setPetals(7);
        flower.setPrice(10);
        flower.display();

    }
}
