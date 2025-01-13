package Method;

class StatVar6 {
    static int x = 4;

    public static void main(String[] args) {
        System.out.println(x);
        int x = 10;
        System.out.println(x);
        abc();
    }
    public static void abc() {
        System.out.println(x);
        String x = "Qspider";
        System.out.println(x);
    }
}

/*
If we want to refer (use) a static variable when we have local
variable of same name. We use class name as a reference.
 */
