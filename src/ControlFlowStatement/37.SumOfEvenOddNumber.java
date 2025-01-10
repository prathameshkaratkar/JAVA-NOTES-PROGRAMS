package ControlFlowStatement;

import java.util.Scanner;

class SumOfEvenOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        if(num % 2 == 0) {
            System.out.println(num);
            System.out.println("It is Even number.");
        } else{
            System.out.println("It is Odd Number.");
        }
        while(num > 0) {
            int rem = num % 10;
            sum = sum + rem;
            num /= 10;
        }
        System.out.println(sum);
    }
}
