import java.util.ArrayList;

class Bank {
String name;
ArrayList<Account>accounts;
Bank(String name){
this.name=name;
accounts=new ArrayList<>();
}
void openAccount(Customer customer,double balance){
Account account=new Account(this,customer,balance);
accounts.add(account);
customer.addAccount(account);
}
}

class Customer {
String name;
ArrayList<Account>accounts;
Customer(String name){
this.name=name;
accounts=new ArrayList<>();
}
void addAccount(Account account){
accounts.add(account);
}
void viewBalance(){
for(Account account:accounts){
System.out.println("Bank:"+account.bank.name+", Balance:"+account.balance);
}
}
}

class Account {
Bank bank;
Customer customer;
double balance;
Account(Bank bank,Customer customer,double balance){
this.bank=bank;
this.customer=customer;
this.balance=balance;
}
}

public class BankCustomerAssociation {
public static void main(String[]args){
Bank bank1=new Bank("Bank A");
Bank bank2=new Bank("Bank B");
Customer customer1=new Customer("Alice");
Customer customer2=new Customer("Bob");
bank1.openAccount(customer1,1000);
bank1.openAccount(customer2,1500);
bank2.openAccount(customer1,2000);
System.out.println("Alice's Accounts:");
customer1.viewBalance();
System.out.println("Bob's Accounts:");
customer2.viewBalance();
}
}

