package ObjectOrientedProgramming.Polymorphism;

abstract class PaymentMethod {
    private String ownerName;

    public PaymentMethod(String ownerName) {
        this.ownerName = ownerName;
    }
    public String getOwnerName() {
        return ownerName;
    }

    // Abstract method to be implemented by subclass

    public abstract boolean processPayment(double amount);

    // common method for all payment methods
    public void displayPaymentDetails() {
        System.out.println("Payment owner: "  + ownerName) ;
    }
}
