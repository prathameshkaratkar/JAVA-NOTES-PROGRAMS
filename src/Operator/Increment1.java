package Operator;

import org.w3c.dom.ls.LSOutput;

public class Increment1 {
    public static void main(String[] args) {
        int increment = 100;
        System.out.println(++increment); //101
        System.out.println(++increment); //102
        System.out.println(increment++); //102
        System.out.println(increment++); //103
        System.out.println(increment++); //105
        System.out.println(--increment); //104
        System.out.println(--increment); //103
        System.out.println(increment--); //103
        System.out.println(increment); // 102
    }
}
