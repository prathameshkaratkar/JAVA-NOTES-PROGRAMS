package ControlFlowStatement;

import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int year = sw.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("It is a Leap Year");
        } else{
            System.out.println("It is not a Leap Year");
        }
    }
}
