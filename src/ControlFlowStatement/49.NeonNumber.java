package ControlFlowStatement;

import java.util.Scanner;

class NeonNumber {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = f.nextInt();
        int square = 1;
        int sum = 0;
        square = num * num;
        while(square > 0) {
            int rem = square %  10;
            square /= 10;
            sum = sum + rem;

        }
        if(sum == num) {
            System.out.println("It is Neon Number.");
        } else{
            System.out.println("It is Not Neon Number.");
        }
    }
}
