package ObjectOrientedProgramming;




class Bike {
    String name;
    int cc;
    String type;

    public void displayBike(){
        String name = "chapri bike";
        System.out.println(name);  // chapri bike
        System.out.println(this.name); // KTM Duke
        System.out.println(cc);
        System.out.println(type);
    }
}
class BikeDriver {
    public static void main(String[] args) {
        Bike b1  = new Bike();
        b1.name = "KTM Duke";
        b1.cc = 390;
        b1.type = "Petrol";
        b1.displayBike();
    }
}
