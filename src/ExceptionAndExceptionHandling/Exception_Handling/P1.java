package ExceptionAndExceptionHandling.Exception_Handling;

import java.util.Scanner;

class P1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = input.nextInt();

        try {
            int res = n1 / n2;
            System.out.println(res);
        } catch (ArithmeticException r) {
            System.out.println("Don't divide by zero!");

        }
        System.out.println("thank You");
    }
}
