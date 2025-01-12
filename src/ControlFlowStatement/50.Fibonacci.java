package ControlFlowStatement;

import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int ip = sc.nextInt();
        int count = 0;
        int n1 = 0;
        int n2 = 0;
        int n3;
        while (count < ip) {
            n3 = n1 + n2;
            System.out.println(n1);
            n1 = n2;
            n2 = n3;
            count++;
        }
    }
}
