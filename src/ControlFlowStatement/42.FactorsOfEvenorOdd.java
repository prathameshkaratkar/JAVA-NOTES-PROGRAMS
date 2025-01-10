package ControlFlowStatement;

import java.util.Scanner;

class FactorsOfEvenorOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int den = 1;
        while(den <= num) {
            if(num % 2 ==0) {
                System.out.println(den + " is even");
            }
             else{
                System.out.println(den + " is odd");
            }
             den++;
        }
    }
}
