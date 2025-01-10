package ControlFlowStatement;

import java.util.Scanner;

class RangeLeapYear {
    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);
        System.out.print("enter the start year");
        int start = sw.nextInt();
        System.out.print("Enter the end year: ");
        int end = sw.nextInt();
        for(int a = start; a <= end; a++) {
            if((a%4==0 && a%100!=0) || (a%400==0)){
                System.out.println(a);
            }
        }

    }
}
