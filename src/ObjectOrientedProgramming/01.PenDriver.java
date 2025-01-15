package ObjectOrientedProgramming;
// This example is referred to non static variables.

class Pen {
    String brand;
    String type;
    double price;
    String color;
    double thick;
}

class PenDrive{
    public static void main(String[] args) {
        Pen p1 = new Pen();
        System.out.println(p1.brand);
        System.out.println(p1.type);
        System.out.println(p1.price);
        System.out.println(p1.color);
        System.out.println(p1.thick);

        System.out.println("=============");
        p1.brand = "Cello";
        p1.type = "Ball Point";
        p1.price = 10.0;
        p1.color = "Black";
        p1.thick = 0.5;

        System.out.println("Brand : " + p1.brand);
        System.out.println("Type : " + p1.type );
        System.out.println("Price : " + p1.price);
        System.out.println("Color : " + p1.color);
        System.out.println("Thick : " + p1.thick);

        Pen p2 = new Pen();
        p2.brand = "Reynold";
        p2.type = "Gel";
        p2.price = 20;
        p2.color = "Blue";
        p2.thick = 0.7;

        System.out.println("=============");
        System.out.println("Brand : " + p2.brand);
        System.out.println("Type : " + p2.type);
        System.out.println("Price : " + p2.price);
        System.out.println("Color : " + p2.color);
        System.out.println("Thick : " + p2.thick);
    }
}
