class BankAccount{
    String accountNumber;double balance;
    BankAccount(String accountNumber,double balance){
        this.accountNumber=accountNumber;this.balance=balance;
    }
    void displayInfo(){
        System.out.println("Account Number: "+accountNumber+", Balance: $"+balance);
    }
}
class SavingsAccount extends BankAccount{
    double interestRate;
    SavingsAccount(String accountNumber,double balance,double interestRate){
        super(accountNumber,balance);
        this.interestRate=interestRate;
    }
    void displayAccountType(){
        System.out.println("Account Type: Savings, Interest Rate: "+interestRate+"%");
    }
}
class CheckingAccount extends BankAccount{
    double withdrawalLimit;
    CheckingAccount(String accountNumber,double balance,double withdrawalLimit){
        super(accountNumber,balance);
        this.withdrawalLimit=withdrawalLimit;
    }
    void displayAccountType(){
        System.out.println("Account Type: Checking, Withdrawal Limit: $"+withdrawalLimit);
    }
}
class FixedDepositAccount extends BankAccount{
    int maturityPeriod;
    FixedDepositAccount(String accountNumber,double balance,int maturityPeriod){
        super(accountNumber,balance);
        this.maturityPeriod=maturityPeriod;
    }
    void displayAccountType(){
        System.out.println("Account Type: Fixed Deposit, Maturity Period: "+maturityPeriod+" months");
    }
}
public class BankingSystem{
    public static void main(String[] args){
        SavingsAccount s=new SavingsAccount("S1001",5000,3.5);
        CheckingAccount c=new CheckingAccount("C1002",2000,1000);
        FixedDepositAccount f=new FixedDepositAccount("F1003",10000,12);
        s.displayInfo();s.displayAccountType();
        c.displayInfo();c.displayAccountType();
        f.displayInfo();f.displayAccountType();
    }
}
