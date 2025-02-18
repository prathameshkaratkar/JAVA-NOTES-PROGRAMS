package ObjectOrientedProgramming.Polymorphism;

class PaymentProcessor {
    public static boolean executePayment(PaymentMethod paymentMethod, double amount) {
        System.out.println("\n-- Processing Payment ---");
        paymentMethod.displayPaymentDetails();
        boolean result = paymentMethod.processPayment(amount);
        System.out.println("--- End of Transaction ---\n");
        return result;
    }
}
