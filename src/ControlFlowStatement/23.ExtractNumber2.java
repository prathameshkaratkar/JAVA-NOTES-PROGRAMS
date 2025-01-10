package ControlFlowStatement;

class ExtractNumber2 {
    public static void main(String[] args) {
        for(int a = 123443; a > 0; a/= 10) {
            int rem = a % 10;
            System.out.println(rem);
        }
    }
}
