package ControlFlowStatement;

class ReverseNumber {
    public static void main(String[] args) {
        int num = 23452;
        int reverse = 0;
        while(num > 0) {
            int rem = num % 10;
            reverse = (reverse * 10) + rem;
            num /= 10;
        }
        System.out.println(reverse);
    }
}
