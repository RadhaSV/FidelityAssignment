class Account{
 
    private int accno;
    private String name;
    private double balance;
 
    Account(int accno, String name, double balance)
    {
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }
 
    public void deposit(int depAmount)
    {
        if(depAmount>=1)
        {
            balance = balance + depAmount;
        }
        else{
            System.out.println("Enter the Valid Amount");
        }
    }
 
    public void withdrawal(int withdrawalAmount)
    {
        if(withdrawalAmount>=1)
        {
            balance = balance - withdrawalAmount;
        }
        else{
            System.out.println("Enter the Valid Amount");
        }
    }
 
    public void balance()
    {
        System.out.println(accno + " " + name + " " + balance);
    }
}
 
public class AccountDetails {
    public static void main(String[] args) {
        Account account1 = new Account(1, "Radha", 100);
        account1.deposit(100);
        account1.withdrawal(10);
        account1.balance();
 
    }
}