package ObjectOrientedProgramming;

class ACDriver {
    public static void main(String[] args) {
        AC a1 = new AC();
        a1.brand = "Voltas";
        a1.price = 30000;
        a1.model = 1911;
        a1.type = "Domestic";
        a1.star = 3;
        a1.ton  = 5;
        a1.ambient = 17;
        a1.maxtemp = 25;
        a1.mintemp = 16;

        a1.showMaxTemp();
        a1.showAmbientTemp();
        a1.displayAC();


        System.out.println("=====================");
        AC a2 = new AC();
        a2.brand = "Blue star";
        a2.price = 100000;
        a2.model = 234534;
        a2.type = "Commercial";
        a2.ton = 8;
        a2.star = 5;
        a2.ambient = 29;
        a2.maxtemp = 22;
        a2.mintemp = 27;

        a2.showMaxTemp();
        a2.showAmbientTemp();
        a2.displayAC();
    }
}
