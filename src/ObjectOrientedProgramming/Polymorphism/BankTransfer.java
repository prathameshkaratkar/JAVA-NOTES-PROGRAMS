package ObjectOrientedProgramming.Polymorphism;

class BankTransfer extends PaymentMethod {
    private String accountNumber;
    private String bankName;
    private double accountBalance;

    public BankTransfer(String ownerName, String accountNumber, String bankName, double accountBalance) {
        super(ownerName);
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.accountBalance = accountBalance;

    }

    @Override
    public boolean processPayment(double amount) {
        if(amount <= accountBalance) {
            System.out.println("Processing bank transfer of $" + amount);
            System.out.println("Bank transfer successfull !");
            return true;
        } else{
            System.out.println("Bank transfer failed :  Insufficient funds");
            return false;
        }
    }
    @Override
    public void displayPaymentDetails() {
        super.displayPaymentDetails();
        System.out.println("Payment method: Bank Transfer");
        System.out.println("Bank: " + bankName);
        System.out.println("Account: " + maskAccountNumber());
    }

    private String maskAccountNumber() {
        return "****** " + accountNumber.substring(accountNumber.length() - 4);
    }

    public static class PaymentDemo {
        public static void main(String[] args) {
            // Create different payment methods

            CreditCard creditCard = new CreditCard("John Smith","1234567890123456","12/2025",123,5000.0);
            PayPal payPal = new PayPal("Jane Doe","jane.deo@example.com",1000.0);
            BankTransfer bankTransfer = new BankTransfer("Robert Johnson","9876543210","Chase Bank",2500.0);

            // process payments using polymorphism
            // The PaymentProcessor doesn't need to know the specific type of payment method.

            PaymentProcessor.executePayment(creditCard,1500.0);
            PaymentProcessor.executePayment(payPal, 750.0);
            PaymentProcessor.executePayment(bankTransfer,2000.0);

            // Payment that will fail due to exceeds limit
            PaymentProcessor.executePayment(creditCard, 7000.0);
        }
    }
}
