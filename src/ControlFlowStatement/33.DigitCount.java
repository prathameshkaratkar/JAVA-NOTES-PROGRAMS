package ControlFlowStatement;

import java.util.Scanner;

class DigitCount {
    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);
        System.out.print("enter the digit: ");
        int num = sw.nextInt();
        int count = 0;
        do {
            num /= 10;
            count++;
        } while (num != 0);
        System.out.println("the count of digit : "+ count);
    }
}
