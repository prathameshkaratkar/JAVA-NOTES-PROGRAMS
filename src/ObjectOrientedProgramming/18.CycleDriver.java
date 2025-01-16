package ObjectOrientedProgramming;

class Cycle {
    String brand;
    double price;
    String type;
    int wheels;
    boolean gear;

    Cycle(String brand, double price, int wheels) {
        this.brand = brand;
        this.price = price;
        this.wheels = wheels;
    }
    Cycle(String brand, double price, int wheels, String type) {
        this.brand = brand;
        this.price = price;
        this.wheels = wheels;
        this.type = type;
    }
    Cycle(String brand, double price, int wheels, String type, boolean gear) {
        this.brand  = brand;
        this.price = price;
        this.wheels = wheels;
        this.type = type;
        this.gear  = gear;
    }
    public void displayCycle(){
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Wheels: " + wheels);
        System.out.println("Type: " + type);
        System.out.println("Gear: " + gear);
    }

}
class CycleDriver {
    public static void main(String[] args) {
        Cycle c1 = new Cycle("Hero",3000.0,2,"sport",true);
        c1.displayCycle();
    }
}
