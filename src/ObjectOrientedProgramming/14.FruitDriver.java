package ObjectOrientedProgramming;

class Fruit{
    String name;
    double price;
    String taste;
    String origin;
    String color;

    public Fruit displayName(){
        System.out.println(name);
        System.out.println(this);
        return this;
    }
    public Fruit displayPrice() {
        System.out.println(name);
        System.out.println(this);
        return this;
    }
    public Fruit displayTaste(){
        System.out.println(taste);
        System.out.println(this);
        return this;
    }
}
class FruitDriver {
    public static void main(String[] args) {
        Fruit f1 = new Fruit();
        f1.name = "Mango";
        f1.price = 500.00;
        f1.origin = "Ratnagiri";
        f1.taste = "Sweet";
        f1.color = "Yellow";

        f1.displayName().displayPrice().displayTaste();
    }
}

