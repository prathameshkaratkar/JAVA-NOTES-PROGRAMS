package ControlFlowStatement;

import java.util.Scanner;

class SumOfCountOfPowerOfDigit {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int start = f.nextInt();
        int temp = start;
        int count = 0;
        while(temp != 0) {
            temp /= 10;
            count++;
        }
        int sum = 0;
        for (int i = start; i!= 0; i/= 10) {
            int rem = i % 10;
            int pow = 1;
            for(int j=0;j<count;j++) {
                pow *= rem;
            }
            sum += pow;
        }
        if(sum == start){
            System.out.println("It is an Armstrong Number.");
        } else {
            System.out.println("Not an Armstrong Number.");
        }
    }
}
