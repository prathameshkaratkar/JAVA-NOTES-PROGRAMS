package ControlFlowStatement;

public class IncomeTax {
    public static void main(String[] args) {
        int annualSal = 2500000;
        if(annualSal > 0 && annualSal <= 250000){
            System.out.println("Exempt");
        } else if (annualSal > 250000 && annualSal <= 300000){
            System.out.println("Pay 5% tax of annual sal");
        } else if(annualSal > 500000 && annualSal <= 750000) {
            System.out.println("Pay 10% tax of annual sal");
        } else if(annualSal >750000 && annualSal <= 1000000) {
            System.out.println("Pay 15% tax of annual sal");
        } else if(annualSal > 1000000 && annualSal <= 1250000) {
            System.out.println("Pay 20% tax of annual sal");
        } else if(annualSal > 1500000) {
            System.out.println("Pay 30% tax of annual sal");
        } else {
            System.out.println("Invalid Annual sal");
        }
    }
}
