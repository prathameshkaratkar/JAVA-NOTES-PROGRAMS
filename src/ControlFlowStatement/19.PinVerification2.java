package ControlFlowStatement;

import java.util.Scanner;

class PinVerification2 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int actPin = 1234;
        for(int attempt = 0; attempt < 3; attempt++) {
            System.out.print("Enter the pin:");
            int pin = c.nextInt();
            if(pin == actPin) {
                System.out.println("Login Successful!");
                break;

            } else {
                System.out.println("Wrong Pin!");
            }
        }
    }
}
