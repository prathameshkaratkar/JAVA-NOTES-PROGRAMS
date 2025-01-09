package Operator;

public class Increment3 {
    public static void main(String[] args) {
        int x = 50, y = -3, z = 105, p;
        p = x-- + y-- + ++z;
        z = ++p + p++ - --y;
        y = --y + ++x + z--;
        System.out.println(p);
        System.out.println(z);
        System.out.println(y);
        System.out.println(x);
    }
}
