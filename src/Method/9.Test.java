package Method;

import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting Number: ");
        int start = sc.nextInt();
        System.out.println("Enter Ending Number: ");
        int end = sc.nextInt();

        for(int i = start; i< end; i++) {
            if(checkEven(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean checkEven(int num) {
        if(num  % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
