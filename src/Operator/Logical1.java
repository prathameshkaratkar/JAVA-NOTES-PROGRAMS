package Operator;

public class Logical1 {
    public static void main(String[] args) {
        System.out.println(true && false);
        System.out.println(true && true);
        System.out.println(true || false);
        System.out.println(false || false);
        System.out.println('a'>'A' && (1==0));
        System.out.println(10 != 9 || false);
        System.out.println(!true);
        System.out.println(true !=true || false == false);
        System.out.println(!false && 56 %2 ==0);
    }
}
