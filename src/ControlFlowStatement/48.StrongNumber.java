package ControlFlowStatement;

import java.util.Scanner;

class StrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = s.nextInt();
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int rem = temp % 10;
            int fact = 1;
            for(int i = rem; i>0;i--) {
                fact = fact *i;
            }
            sum = sum + fact;
            temp != 10;
        }
        if(num == sum) {
            System.out.println("It is Strong Number");
        } else {
            System.out.println("It is not Strong Number");
        }
    }
}
