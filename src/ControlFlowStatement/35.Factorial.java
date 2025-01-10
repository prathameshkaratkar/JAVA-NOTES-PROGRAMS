package ControlFlowStatement;

import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = f.nextInt();
        double fact = 1;
        while(num > 0) {
            fact = fact * num;
            num--;
        }
        System.out.println(fact);

    }
}
