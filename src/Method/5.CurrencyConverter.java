package Method;

import java.util.Scanner;

class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of Rupee.");
        double inr = sc.nextDouble();
        rupeeToDollar(inr);

    }
    public static void rupeeToDollar(double rupee) {
        double Dollar = (rupee/82.31);
        int temp = (int) (Dollar * 100);
        System.out.println(temp / 100.0);
        DollarToEuro(temp / 100.0);
    }
    public static void DollarToEuro(double Dollar) {
        double Euro = Dollar * 0.92;
        int temp = (int) (Euro * 100);
        System.out.println(temp / 100.0);
        EuroToDirham(temp / 100.0);
    }
    public static void EuroToDirham(double Euro) {
        double Dirham = Euro * 3.98;
        int temp = (int) (Dirham * 100);
        System.out.println(temp / 100.0);
        DirhamToPound(temp / 100.0);
    }
    public static void DirhamToPound(double Dirham) {
        double pound = Dirham * 0.22;
        int temp = (int) (pound *100);
        System.out.println(temp / 100.0);
    }
}
