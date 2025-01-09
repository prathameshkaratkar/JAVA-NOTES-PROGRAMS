package Operator;

public class Increment2 {
    public static void main(String[] args) {
        int a1 = 15, b1 = 7, c1;
        c1 = a1++ + ++b1;
        b1 = ++c1 - ++a1;
        a1 = a1 + b1 + ++a1 - --c1;

        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
    }
}
