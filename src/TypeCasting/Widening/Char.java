package TypeCasting.Widening;

public class Char {
    public static void main(String[] args) {
        char c = 'a';
        int i = c;
        long l = c;
        float f = c;
        double d = c;

        System.out.println(c);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }
}
