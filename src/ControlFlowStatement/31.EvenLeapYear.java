package ControlFlowStatement;

import java.util.Scanner;

class EvenLeapYear {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("Enter the start year: ");
        int start = c.nextInt();
        System.out.println("Enter the end year: ");
        int end = c. nextInt();
        int a;
        for( a = start; a <=end; a++) {
            if((a%4==0 && a%100!= 0) || (a%400==0)) {
                System.out.println(a);
            }
        }
        if(a % 2 == 0) {
            System.out.println("It is Even Loop year");
        }
    }
}
