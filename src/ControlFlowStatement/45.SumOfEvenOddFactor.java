package ControlFlowStatement;

import java.util.Scanner;

class SumOfEvenOddFactor {
    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sw.nextInt();
        int den = 1;
        int sum1 = 0;
        int sum2 = 0;
        while(den <= num ) {
            if(num % den == 0) {
                if(den % 2 == 0) {
                    sum1 += den;
                }
            } else{
                sum2 += den;
            }
            den++;
        }
        System.out.println("Odd sum = "+ sum2);
        System.out.println("Even sum = " + sum1);
    }
}
