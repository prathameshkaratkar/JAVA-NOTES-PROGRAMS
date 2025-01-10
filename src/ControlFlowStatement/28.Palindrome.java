package ControlFlowStatement;

import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sd.nextInt();
        int rev = 0;
        for(int a =num; a> 0; a /= 10) {
            int rem = a % 10;
            rev =(rev * 10) + rem;
        }
        if(num == rev) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}
