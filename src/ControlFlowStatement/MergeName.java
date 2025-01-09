package ControlFlowStatement;

import java.util.Scanner;

public class MergeName {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter your first name : ");
        String first = input.next();
        System.out.println("enter your last name: ");
        String last = input.next();

        System.out.println("your full name is:" + first + " last is: " + last);
    }
}
