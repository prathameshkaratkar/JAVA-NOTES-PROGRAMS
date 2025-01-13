package Method;

class StatVar7 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x); // 10
        System.out.println(StatVar6.x); // 4
        abc();
    }
    public static void abc() {
        String x = "Qspider";
        System.out.println(x);  // Qspider
        System.out.println(StatVar6.x); // 4
    }
}
