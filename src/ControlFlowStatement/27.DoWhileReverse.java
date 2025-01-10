package ControlFlowStatement;

class DoWhileReverse {
    public static void main(String[] args) {
        int num = 23452;
        int reverse = 0;
        do {
            int rem = num % 10;
            reverse = (reverse * 10) + rem;
            num /= 10;
        }while (num > 0);
        System.out.println(reverse);
    }
}
