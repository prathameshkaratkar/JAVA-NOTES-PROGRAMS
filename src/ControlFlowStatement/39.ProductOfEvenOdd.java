package ControlFlowStatement;

import java.util.Scanner;

class ProductOfEvenOdd {
    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sw.nextInt();
        int pro = 1;
        if(num % 2 == 0) {
            System.out.println(num);
            System.out.println("It is Even Number.");
        } else {
            System.out.println("It is Odd Number.");
        }
        while(num > 0) {
            int rem = num % 10;
            pro = pro * rem;
            num /= 10;
        }
        System.out.println(pro);
    }
}
