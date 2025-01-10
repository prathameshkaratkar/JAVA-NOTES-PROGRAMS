package ControlFlowStatement;

import java.util.Scanner;

class For4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter starting Alphabet:");
        char a = s.next().charAt(0);
        System.out.println("Enter Ending Point: ");
        int end = s.nextInt();
        int start = 0;
        do {
            if(start % 2 != 0) {
                System.out.println(start);
            }
            start++;
        } while(start <= end);
    }
}
