class BankAccount{
    static String bankName="hdfc";
    static int TotalAccounts=0;
    static void  getTotalAccounts(){
      System.out.println("total account"+TotalAccounts);
    }
    String accountHolderName;
    BankAccount(String accountHolderName ,int accountNumber){
        this.accountHolderName =accountHolderName ;
        this.accountNumber=accountNumber;
        TotalAccounts++;
    }
   
    final int accountNumber;
    void displayAccount(){
        if(this instanceof BankAccount){
            System.out.println("account holder"+this.accountHolderName);
            System.out.println("account number"+accountNumber);
            System.out.println("bank name"+bankName);
        }
    }

    public static void main(String[] args) {
        BankAccount obj1=new BankAccount("govind",101);
        BankAccount obj2=new BankAccount("karan",102);
        obj1.displayAccount();
        obj2.displayAccount();
        BankAccount.getTotalAccounts();
        

    }


}