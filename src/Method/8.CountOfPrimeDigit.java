package Method;

import java.util.Scanner;

class CountOfPrimeDigit {
    public static boolean checkPrime(int num) {
        if(num == 1) {
            return false;
        } else {
            for(int i = 2; i< num; i++) {
                if(num % 2 == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    public static int countPrimeDigit(int num) {
        int count = 0;
        while(num > 0) {
            int rem = num % 10;
            boolean ans = checkPrime(rem);
            if(ans){
                count++;
            }
            num /= 10;
        }
        return count++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int ip = sc.nextInt();
        System.out.println(countPrimeDigit(ip));
    }
}
