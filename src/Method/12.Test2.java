package Method;

class Test2 {
    public static void main(String[] args) {
        System.out.println("Main Begin");
        abc(10,28);
        xyz(123);
        System.out.println("Main End");
    }
    public static void abc(int a, int b) {
        System.out.println("abc() begin");
        int res = a+b;
        System.out.println(res);
        System.out.println("abc() End");
    }
    public static void xyz(int num) {
        System.out.println("xyz() Begin");
        if(num % 2 == 0) {
            System.out.println("It is even");
        } else {
            System.out.println("It is odd");
        }
        System.out.println("xyz() End");
    }
}
