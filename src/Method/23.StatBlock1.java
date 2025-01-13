package Method;

class StatBlock1 {
    static {
        for(int i = 0; i < 5; i++ ){
            System.out.println("From static block");
        }
    }

    public static void main(String[] args) {
        System.out.println("From Main Method.");
    }
}

