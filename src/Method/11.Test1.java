package Method;

class Test1 {
    public static void abc() {
        System.out.println("From abc()");
        return;
    }

    public static void main(String[] args) {
        System.out.println("From Main() ");
        abc();
        return;
    }
}
