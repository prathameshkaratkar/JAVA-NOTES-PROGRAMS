package ControlFlowStatement;

import java.util.Scanner;

class BuzzNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int delta = sc.nextInt();
        int rem = 0;
        while(delta > 0) {
            rem = delta % 10;
            if(delta % 7 == 0 || rem == 7) {
                System.out.println("It is Buzz Number");
            } else {
                System.out.println("It is not Buzz Number");
            }
        }
    }
}
