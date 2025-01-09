package TypeCasting.Narrowing;

public class Narrow1 {
    public static void main(String[] args) {
        int a = (int) 23.23;
        System.out.println(a); //23
        char ch = (char) 150l;
        System.out.println(ch);
        float f = (float) 23.5656345634;
        System.out.println(f);
    }
}
