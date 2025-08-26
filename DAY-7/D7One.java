class Customer{
    private String name;
    private String gender;
    private int age;
    private long phoneNumber;
    public Customer(String name,String gender,int age,long ph_no){
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.phoneNumber=ph_no;
    }
    void dispalyCustomerdetails(){
        System.out.println("Customer details:");
        System.out.println("Name: "+name+"\nGender: "+gender+"\nAge: "+age+"\nPhoneNumber: "+phoneNumber);
    }
}
class Account{
    private long accountNumber;
    private double balance;
    public Account(long accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    void deposit(int a){
        if(a>0){
            balance+=a;
            System.out.println("Deposited: "+a+ "\nYour Balance is: "+balance);
            
        }
        else{
            System.out.println("Invalid amount");
        }
        
    }
    void withdraw(int a){
        if(a>0&&a<=balance){
            balance-=a;
            System.out.println("Your withdrawal is SUccessful");
            System.out.println("Balance: "+balance);
        }else{
            System.out.println("Invalid amount");
        }
    }
    void dispalyAccountdetails(){
        System.out.println("\nAccount details: ");
        System.out.println("Account Number: "+accountNumber+"\nBalance: "+balance);
    }
}
class RBI{
    Customer c; 
    Account a;
    public double getInterestRate(){
        return 4.0;
     }
    public double getWithdrawalLimit(){
        return 180000;
    }
    public double getMinimumBalane(){
        return 1000.0;
    }
    public void showGuidelines() {
        System.out.println("\n--- RBI Guidelines ---");
        System.out.println("Minimum Interest Rate: " + getInterestRate() + "%");
        System.out.println("Max Withdrawal Limit: " + getWithdrawalLimit());
        System.out.println("Minimum Balance: " + getMinimumBalane());
    }

}
class SBI extends  RBI{
    public double GetInterestRate(){
        return 4.5;
     }
    public double GetWithdrawalLimit(){
        return 150000;
    }
    public double minimumBalane(){
        return 1500.0;
    }

}
class ICICI extends RBI{
    public double GetInterestRate(){
        return 4.6;
     }
    public double GetWithdrawalLimit(){
        return 100000;
    }
    public double minimumBalane(){
        return 2000.0;
    }
}
public class D7One {
    public static void main(String[] args) {
        Customer customer=new Customer("Chiranjeevi", "Male", 21, 785875986L);
        Account account=new Account(75676587789L, 55000);
        SBI sbi=new SBI();
        sbi.c=customer;
        System.out.println("---SBI Bank---");
        sbi.c.dispalyCustomerdetails();
        sbi.a=account;
        sbi.a.dispalyAccountdetails();
        sbi.a.withdraw(4000);
        sbi.showGuidelines();
        System.out.println("\n---ICIC Bank---");
        ICICI icici=new ICICI();
        icici.c=customer;
        icici.a=account;
        icici.c.dispalyCustomerdetails();
        icici.a.dispalyAccountdetails();
        icici.a.deposit(6000);
        icici.showGuidelines();
    }
}
