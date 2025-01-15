package ObjectOrientedProgramming;


class Bottle{
    String brand = "Milton";
    double cap;
    String type;
    double price;
    {
        System.out.println("Bottle created !");
    }
    public void displayBottle(){
        System.out.println(brand);
        System.out.println(cap);
        System.out.println(type);
        System.out.println(price);
    }
}

class BottleDriver {
    public static void main(String[] args) {
        Bottle b1 =new Bottle();
        b1.type = "Fibre";
        b1.price = 100.00;
        b1.cap  = 1000;

        b1.displayBottle();


        Bottle b2 = new Bottle();
        Bottle b3 = new Bottle();
    }
}
