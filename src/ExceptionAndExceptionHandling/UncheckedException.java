package ExceptionAndExceptionHandling;

import java.util.Scanner;

class UncheckedException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int n1 = input.nextInt();
        System.out.println("Enter second Number: ");
        int n2 = input.nextInt();
        int res = n1 / n2;
        System.out.println(res);
    }
}
