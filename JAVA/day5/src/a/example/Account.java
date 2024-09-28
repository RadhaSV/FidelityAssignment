package a.example;

import java.util.Scanner;

class Account {
    int id;
    String accountType;
    double balance;
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public Account(int id, String accountType, double balance) {
        this.id = id;
        this.accountType = accountType;
        this.balance = balance;
    }
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }}
    public String getDetails() {
        return "account id: " + id + "\naccountType: " + accountType + " \nbalance" + balance;
    }

    public static class AccountDetails {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter account id: ");
            int id = sc.nextInt();
            System.out.println("Enter account type: ");
            String accountType = sc.next();
            System.out.println("Enter balance: ");
            double balance = sc.nextDouble();
            Account account = new Account(id, accountType, balance);
            System.out.println(account.getDetails());
            System.out.println("enter amount to be withdrawn:");
            double amount = sc.nextDouble();
            if (account.withdraw(amount)) {
                System.out.println("new balance" + account.getBalance());
            } else {
                System.out.println("insufficient balance");
            }
        }
    }
}
