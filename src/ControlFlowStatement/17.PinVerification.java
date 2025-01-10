package ControlFlowStatement;

import java.util.Scanner;

class PinVerification {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int attempt = 0;
        int actPin = 1234;
        do {
            System.out.println("Enter your pin: ");
            int pin = c.nextInt();
            if(pin == actPin) {
                System.out.println("Login Successful");
                break;
            }
            System.out.println("Pin Incorrect!");
            attempt++;
        }while (attempt < 3);
        if (attempt == 3) {
            System.out.println("Maximum attempt reached !");
        }
    }
}
