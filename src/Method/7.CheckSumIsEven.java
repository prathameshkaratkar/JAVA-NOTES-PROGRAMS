package Method;

import java.util.Scanner;

class CheckSumIsEven {
    public static int SumOfDigits(int num) {
        int sum = 0;
        while(num != 0) {
            int rem = num % 10;
            sum = sum + rem;
            num /= 10;
        }
        return sum;
    }
    public static boolean CheckEvenOdd(int sum1) {
        if(sum1 % 2 == 0) {
            return true;
        } else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int ip = sc.nextInt();
        int sum = SumOfDigits(ip);
        boolean isCheck = CheckEvenOdd(sum);
        if(isCheck) {
            System.out.println("the sum of digit is Even!");
        } else {
            System.out.println("The sum of digit is Odd!");
        }
    }

}
