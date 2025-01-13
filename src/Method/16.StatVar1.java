package Method;

class StatVar1 {
    static int a;
    static double d;
    static String s;

    public static void main(String[] args) {
        System.out.println("From Main");
        System.out.println(a);
        System.out.println(d);
        System.out.println(s);
        test();
    }
    public static void test(){
        System.out.println("From test");
        System.out.println(a);
        System.out.println(d);
        System.out.println(s);
    }
}
