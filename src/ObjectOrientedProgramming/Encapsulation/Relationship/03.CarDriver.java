package ObjectOrientedProgramming.Encapsulation.Relationship;

class CarDriver {
    public static void main(String[] args) {
        Car c1 = new Car("Tata","White",80000.00,"Sedan");
        c1.displayCar();
        c1.eng.displayEngine();
    }
}
