package TypeCasting.Widening;

public class Int {
    public static void main(String[] args) {
        int i = 200;
        long l = i;
        float f = i;
        double d = i;
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }
}
