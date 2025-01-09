package Operator;

public class LargestOfThree {
    public static void main(String[] args) {
        int a = 54;
        int b = 333;
        int c = 2323;
        int d;
        int ans = a >(d=b >c?b:c) ? a:d;
        System.out.println(ans);
    }
}
