package ObjectOrientedProgramming.Inheritance;

class SavingAccount extends Account {
    double balance;
    double interest;
    double limit;
    double min;

    public SavingAccount(){}

    SavingAccount(String bank, String branch, long accno, String ifsc, String name, double balance, double interest, double limit, double min){
        this.bank = bank;
        this.branch = branch;
        this.accno = accno;
        this.ifsc = ifsc;
        this.name = name;

        this.balance = balance;
        this.interest = interest;
        this.limit = limit;
        this.min = min;

        System.out.println("Saving Account Created !");
    }

    public void displaySavingAccount(){
        displayAccount();
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + interest);
        System.out.println("Limit: " + limit);
        System.out.println("Min Balance: " + min);
        System.out.println("================");

    }
}
