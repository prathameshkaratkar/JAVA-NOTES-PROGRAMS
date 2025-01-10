package ControlFlowStatement;

import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = input.nextInt();
        int dem = 2;
        while(num > dem) {
            if(num % dem == 0) {
                break;
            }
            dem++;
        }
        if(num == dem) {
            System.out.println("It is Prime Number.");
        } else {
            System.out.println("It is not Prime Number.");
        }
    }
}
