package ObjectOrientedProgramming.Polymorphism;

class PayPal extends PaymentMethod{
    private String email;
    private double accountBalance;

    public PayPal(String ownerName, String email, double accountBalance) {
        super(ownerName);
        this.email = email;
        this.accountBalance = accountBalance;
    }

    @Override
    public boolean processPayment(double amount) {
        if(amount <= accountBalance) {
            System.out.println("processing paypal payment");
            System.out.println("PayPal payment successfull");
            return true;
        } else{
            System.out.println("Paypal payment failed: ");
            return false;
        }
    }
    @Override
    public void displayPaymentDetails() {
        super.displayPaymentDetails();
        System.out.println("Payment method:  PayPal");
        System.out.println("Email: " + email);
    }
}
