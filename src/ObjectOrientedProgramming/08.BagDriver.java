package ObjectOrientedProgramming;

class Bag {
    String brand;
    String color;
    String type;
    boolean waterproof;
    int compartment;
}
class BagDriver {
    public static void main(String[] args) {
        Bag b1 = new Bag();
        System.out.println(b1.brand);
        System.out.println(b1.color);
        System.out.println(b1.type);
        System.out.println(b1.waterproof);
        System.out.println(b1.compartment);

        System.out.println("=============");
        b1.brand = "Lenovo";
        b1.color = "Black";
        b1.type = "Laptop Bag";
        b1.waterproof = true;
        b1.compartment = 10;

        System.out.println(b1.brand);
        System.out.println(b1.color);
        System.out.println(b1.type);
        System.out.println(b1.waterproof);
        System.out.println(b1.compartment);

        Bag b2 = new Bag();
        b2.brand  = "American tourist";
        b2.color = "Red";
        b2.type = "Travelling Bag";
        b2.waterproof = true;
        b2.compartment = 6;

        System.out.println("=============");
        System.out.println(b2.brand);
        System.out.println(b2.color);
        System.out.println(b2.type);
        System.out.println(b2.waterproof);
        System.out.println(b2.compartment);
    }
}
