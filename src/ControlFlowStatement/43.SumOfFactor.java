package ControlFlowStatement;

import java.util.Scanner;

class SumOfFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = input.nextInt();
        int sum  = 0;
        int den = 1;
        while(den <= num) {
            if(num % den == 0) {
                sum = sum + den;
            }
            den++;
        }
        System.out.println("sum is: " + sum);
    }
}
