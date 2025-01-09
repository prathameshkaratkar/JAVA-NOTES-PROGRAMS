package ControlFlowStatement;

public class Signal {
    public static void main(String[] args) {
        String signal = "Red";
        if (signal == "Red") {
            System.out.println("Stop the vehicles!");
        } else if(signal == "Green") {
            System.out.println("Ready to go teh vehicles!");
        } else if(signal == "yellow") {
            System.out.println("Go slow!");
        } else  {
            System.out.println("Break the signal pay fine!");
        }
    }
}
