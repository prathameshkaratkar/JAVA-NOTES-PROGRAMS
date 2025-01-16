package ObjectOrientedProgramming.Encapsulation;

class AccountDriver {
    public static void main(String[] args) {
        Account a1 = new Account("ICICI Bank",123456789l,"ICICI332","Deccan","prathamesh",50000.0,1234,"Saving",9130457501l);
        System.out.println(a1.getBalance(3234234,1234));
        System.out.println(a1.getBank());
        a1.Withdraw(100.00,123456789l,1234);
        a1.deposite(123456789l,1234,2000.00);
    }
}
