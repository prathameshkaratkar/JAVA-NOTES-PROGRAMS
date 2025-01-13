package Method;

import java.util.Scanner;

class CheckHappy {
    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int ip = sw.nextInt();
        while(true) {
            ip = isHappy(ip);
            if(ip == 1 || ip == 4) {
                break;
            }
        }
        if(ip == 1) {
            System.out.println("It is Happy Number");
        } else {
            System.out.println("It is Unhappy Number.");
        }
    }
    public static int isHappy(int num ){
        int sum = 0;
        int rem = num % 10;
        sum  += rem * rem;
        num /= 10;
        return sum;
    }

}
