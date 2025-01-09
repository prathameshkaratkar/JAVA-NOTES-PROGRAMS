package TypeCasting.Widening;

public class Long {
    public static void main(String[] args) {
        long l = 50000;
        float f = l;
        double d = l;

        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }
}
