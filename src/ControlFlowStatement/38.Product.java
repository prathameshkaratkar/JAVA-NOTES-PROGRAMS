package ControlFlowStatement;

import java.util.Scanner;

class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int product = 1;
        while(num > 0) {
            int rem = num % 10;
            product = product * rem;
            num /= 10;
        }
        System.out.println(product);
    }
}

