abstract class BankAccount{
    private String accountNumber;
    private String holderName;
    private double balance;
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        if(balance>=amount) balance-=amount;
        else System.out.println("Insufficient funds");
    }
    public abstract double calculateInterest();
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public String getHolderName(){
        return holderName;
    }
    public void setHolderName(String holderName){
        this.holderName=holderName;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
}

class SavingsAccount extends BankAccount{
    public double calculateInterest(){
        return getBalance()*0.04;  // 4% interest on savings account
    }
}

class CurrentAccount extends BankAccount{
    public double calculateInterest(){
        return getBalance()*0.02;  // 2% interest on current account
    }
}

interface Loanable{
    void applyForLoan(double amount);
    boolean calculateLoanEligibility(double balance);
}

class SavingsAccountLoan implements Loanable{
    public void applyForLoan(double amount){
        System.out.println("Loan of "+amount+" applied for Savings Account");
    }
    public boolean calculateLoanEligibility(double balance){
        return balance>=10000;  // Eligibility if balance >= 10000
    }
}

class CurrentAccountLoan implements Loanable{
    public void applyForLoan(double amount){
        System.out.println("Loan of "+amount+" applied for Current Account");
    }
    public boolean calculateLoanEligibility(double balance){
        return balance>=5000;  // Eligibility if balance >= 5000
    }
}

public class Banking{
    public static void main(String[] args){
        BankAccount account1=new SavingsAccount();
        account1.setAccountNumber("S123");
        account1.setHolderName("John");
        account1.setBalance(15000);
        
        BankAccount account2=new CurrentAccount();
        account2.setAccountNumber("C456");
        account2.setHolderName("Alice");
        account2.setBalance(3000);
        
        Loanable loan1=new SavingsAccountLoan();
        Loanable loan2=new CurrentAccountLoan();
        
        BankAccount[] accounts={account1,account2};
        for(BankAccount account:accounts){
            double interest=account.calculateInterest();
            System.out.println("Account: "+account.getAccountNumber()+" Holder: "+account.getHolderName()+" Balance: "+account.getBalance()+" Interest: "+interest);
        }
        
        if(loan1.calculateLoanEligibility(account1.getBalance())) loan1.applyForLoan(10000);
        if(loan2.calculateLoanEligibility(account2.getBalance())) loan2.applyForLoan(5000);
    }
}
