package Method;

class StatBlock2 {
    static {
        System.out.println("From static Block 1");
    }
    static {
        System.out.println("From static Block 2");
    }

    public static void main(String[] args) {
        System.out.println("From Main()");
    }
    static {
        System.out.println("From static Block 3");
    }
}
