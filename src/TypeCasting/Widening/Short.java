package TypeCasting.Widening;

import org.w3c.dom.ls.LSOutput;

public class Short {
    public static void main(String[] args) {
        short s = 150;
        int i = s;
        long l = s;
        float f = s;
        double d = s;
        //char ch = s;

        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
       // System.out.println(ch); // CTE
    }



}
