package ObjectOrientedProgramming.Encapsulation.Relationship;

class Computer {
    String brand;
    String os;
    String processor;
    int ram;
    int rom;
    Pendrive p;

    public Computer(){}

    Computer(String brand, String os, String processor, int ram, int rom) {
        this.brand = brand;
        this.os = os;
        this.rom = rom;
        this.ram = ram;
        this.processor = processor;
    }

    public void insertPendrive(String name, int size, double price) {
        p = new Pendrive();
        System.out.println("Pendrive Inserted");
    }

    public void displayComputer(){
        System.out.println("Brand: " + brand);
        System.out.println("ROM: " + rom);
        System.out.println("RAM: " + ram);
        System.out.println("OS: "  + os);
        System.out.println("Processor: " + processor);
    }
}
