package ControlFlowStatement;

class ForReversed {
    public static void main(String[] args) {
        int num = 23452;
        int reverse = 0;
        for(int a = num; a > 0; a/= 10) {
            int rem = a % 10;
            reverse = (reverse * 10) + rem;
        }
        System.out.println(reverse);
    }
}
