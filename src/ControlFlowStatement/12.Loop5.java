package ControlFlowStatement;

class Loop5 {
    public static void main(String[] args) {
        int start = 1;
        while(start <= 100) {
            if(start %2 == 0) {
                System.out.println(start);
            }
            start++;
        }
    }
}
