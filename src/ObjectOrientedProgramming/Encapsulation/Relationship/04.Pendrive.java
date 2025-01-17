package ObjectOrientedProgramming.Encapsulation.Relationship;

class Pendrive {
    String name;
    int size;
    double price;

    public Pendrive(){

    }

    Pendrive(String name, int size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public void displayPendrive(){
        System.out.println("Name: " + name);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
        System.out.println("=========================");
    }
}
