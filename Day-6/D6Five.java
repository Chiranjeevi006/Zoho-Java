/*Design a class named`BankAccount that uses the concept of encapsulation. The class should have the following private data members:
account number, account holder name, and balance. Provide public getter and setter methods to access and modify these fields.
Also, include a method to deposit and withdraw amount ensuring that the balance cannot go negative. */
class BankAccount{
    private Long accountNumber;
    private String accountHolderName;
    private static double balance;
    public void setAccountNumber(Long accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName=accountHolderName;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    Long getAccountNumber(){
        return accountNumber;
    }
    String getAccountHolderName(){
        return accountHolderName;
    }
    double getBalance(){
        return balance;
    }
    public void deposit(int a){
        if(a>0){
            System.out.println("Deposited: "+a);
            balance+=a;
        }else{
            System.out.println("Invalid");
        }
    }
    public void withdraw(int b){
        if(b>0&&b<=balance){
            System.out.println("Your withdraw is SucessFull");
            balance -=b;
        }
        else{
            System.out.println("Invalid Amount");
        }
    }
    void displayAccountDetails(){
        System.out.println("\nAccount Details:");
        System.out.println("Accoun Number: "+getAccountNumber());
        System.out.println("Account Holder Name: "+getAccountHolderName());
        System.out.println("Account Balance: "+getBalance());

    }

}
public class D6Five {
    public static void main(String[] args) {
        
        BankAccount n1=new BankAccount();
        n1.setAccountNumber(8687578588L);
        n1.setAccountHolderName("Ram K");
        n1.setBalance(87291);
        n1.displayAccountDetails();
        n1.withdraw(65000);
        n1.deposit(5);
        n1.displayAccountDetails();
    }
}
