package ControlFlowStatement;

class IfElseIf1 {
    public static void main(String[] args) {
        double per = 59.99999;
        if(per == 35) {
            System.out.println("Pass  Enjoy");
        } else if(per < 35) {
            System.out.println( "fail ! don't worry");
        } else if (per > 35 && per <= 60) {
            System.out.println( "Second class dont worry  I am here");
        } else if(per > 60 && per < 75) {
            System.out.println( "first class party!");
        } else if (per > 75 && per <= 90) {
            System.out.println("superb first class with distinction!");
        } else if(per > 90 && per <= 100) {
            System.out.println("Great dont worry disturb the neighbour family");
        } else {
            System.out.println("invalid percentage");
        }
    }
}
