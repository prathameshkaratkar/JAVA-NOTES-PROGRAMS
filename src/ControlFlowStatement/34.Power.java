package ControlFlowStatement;

import java.util.Scanner;

class Power {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        System.out.print("Enter the base value: ");
        int base = f.nextInt();
        System.out.println("Enter the raise value: ");
        int raise = f.nextInt();
        int ans = 1;
        while(raise > 0) {
            ans *= base;
            raise--;
        }
        System.out.println(ans);
    }
}
