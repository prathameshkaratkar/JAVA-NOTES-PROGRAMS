package ObjectOrientedProgramming.Encapsulation;

class Account {
    private String bank;
    private long accno;
    private String ifsc;
    private String branch;
    private String name;
    private double balance;
    private int pin;
    private String type;
    private long phno;

    public Account() {

    }

    public Account(String bank, long accno, String ifsc, String branch, String name, double balance, int pin, String type, long phno) {
        this.bank = bank;
        this.accno = accno;
        this.ifsc = ifsc;
        this.branch = branch;
        this.name = name;
        this.balance = balance;
        this.pin = pin;
        this.type = type;
        this.phno = phno;
    }

    public String getBank(){
        return bank;
    }
    public long getAccno(){
        return accno;
    }
    public String getIfsc(){
        return ifsc;
    }
    public String getBranch(){
        return branch;
    }
    public String getName(){
        return name;
    }
    public double getBalance(long accno, int pin){
        if(this.accno == accno && this.pin == pin){
            return balance;
        } else {
            System.out.println("Invalid Credentials");
            return 0;
        }
    }
    public void Withdraw(double amount, long accno, int pin){
        if (accno == this.accno && pin == this.pin) {
            if(amount > 0 && (balance - amount) >= 2000){
                balance -= amount;
                System.out.println("Amount Debited!");
                System.out.println("Your Balance: " + balance);
            } else {
                System.out.println("Insufficient Balance!");
            }
        } else {
            System.out.println("Invalid Credentials");
        }
    }
    public void deposite(long accno, int pin, double amount){
        if(accno == this.accno && pin == this.pin) {
            if(amount > 0) {
                balance += amount;
                System.out.println("Amount Credited!");
                System.out.println(balance);
            } else {
                System.out.println("Invalid Amount!");
            }
        } else {
            System.out.println("Invalid Credentials!");
        }
    }

    public String getType (){
        return type;
    }
    public long getPhno(){
        return phno;
    }
}
