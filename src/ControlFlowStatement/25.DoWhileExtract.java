package ControlFlowStatement;

class DoWhileExtract {
    public static void main(String[] args) {
        int num = 123456789;
        do{
            int rem = num % 10;
            System.out.print(rem);
            num /= 10;
        }while(num > 0);
    }
}
