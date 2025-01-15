package ObjectOrientedProgramming;

class AC {
    String brand;
    int model;
    double price;
    double ton;
    String type;
    double maxtemp;
    double mintemp;
    double ambient;
    int star;

    public void displayAC() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type );
        System.out.println("Ton: " + ton);
        System.out.println("Star:" + star);
    }
    public void showMaxTemp() {
        System.out.println("Max Temp: " + maxtemp);
    }
    public void showAmbientTemp() {
        System.out.println("Ambient Temp: " + ambient);
    }
}
