package ObjectOrientedProgramming.Polymorphism;

class CreditCard extends PaymentMethod{
    private String cardNumber;
    private String expiryDate;
    private int cvv;
    private double creditLimit;

    public CreditCard(String ownerName, String cardNumber, String expiryDate, int cvv, double creditLimit){
        super(ownerName);
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.creditLimit = creditLimit;
    }
    @Override
    public boolean processPayment(double amount) {
        if(amount <= creditLimit) {
            System.out.println("Processing credit card");
            System.out.println("Credit card payment successfull");
            return true;
        } else{
            System.out.println("Credit card payment failed : amount exceeds credit limit");
            return false;
        }
    }
    @Override
    public void displayPaymentDetails (){
        super.displayPaymentDetails();
        System.out.println("Payment method: Credit card");
        System.out.println("Card number: " + maskCardNumber());
    }

    private String maskCardNumber() {
        return "xxxx-xxxx-xxxx" + cardNumber.substring(cardNumber.length() - 4);
    }
}
