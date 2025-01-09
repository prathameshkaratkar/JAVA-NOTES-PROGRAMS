package TypeCasting.Widening;

public class Widen1 {
    public static void main(String[] args) {
        byte a = 127;
        short s = a;
        int i = a;
        long l = a;
        float f = a;
        double d = a;
        //char ch = a;

        System.out.println(a);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        //System.out.println(ch); // CTE
    }
}
