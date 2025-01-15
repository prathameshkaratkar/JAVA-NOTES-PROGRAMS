package ObjectOrientedProgramming;

class Shoe {
    String brand;
    int size;
    double price;
    String type;
    String color;



    public void displayShoe(){
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size);
        System.out.println("Price:" + price);
        System.out.println("Type: " + type);
        System.out.println("Color: "+ color);
    }

}
class ShoeDriver {
    public static void main(String[] args) {
        Shoe s1 = new Shoe();
        s1.brand = "Nike";
        s1.color = "Black";
        s1.price = 5000.00;
        s1.type = "sport";
        s1.size = 9;

        s1.displayShoe();
    }

}
