package ControlFlowStatement;

class CountEvenOddNumber {
    public static void main(String[] args) {
        int evenCount = 0;
        int oddCount = 0;
        for(int i = 10; i<= 20; i++) {
            if(i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even Numbers: " + evenCount);
        System.out.println("Odd Numbers: " + oddCount);
    }
}
