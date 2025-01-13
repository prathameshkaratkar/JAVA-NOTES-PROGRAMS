package Method;

class StatVar3 {
    static int a;

    public static void main(String[] args) {
        System.out.println("Main start");
        System.out.println(a);
        a = 10;
        System.out.println(a);
        demo();
        System.out.println(a);
        System.out.println("Main end");
    }
    public static void demo() {
        System.out.println("demo start");
        System.out.println(a);
        a = 5;
        System.out.println(a);
        System.out.println("demo end");
    }
}
