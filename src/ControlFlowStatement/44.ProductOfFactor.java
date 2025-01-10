package ControlFlowStatement;

import java.util.Scanner;

class ProductOfFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = input.nextInt();
        int den = 1;
        long pro = 1;
        while(den <= num ){
            if(num % den == 0) {
                pro = pro * den;
            }
            den++;
        }
        System.out.println("Pro is: "+ pro);
    }
}
