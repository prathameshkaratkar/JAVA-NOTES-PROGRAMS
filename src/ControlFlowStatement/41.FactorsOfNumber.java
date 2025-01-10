package ControlFlowStatement;

import java.util.Scanner;

class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int den = 1;
        while(den <= num) {
            if(num % den == 0) {
                System.out.print(den+" ");
            }
            den++;
        }
    }
}
