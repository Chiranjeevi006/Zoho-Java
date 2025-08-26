/*Design a Payment Gateway System using an interface named PaymentMethod with a method pay(double amount).
Implement this interface in different classes like CreditCardPayment, DebitCardPayment, and UPIPayment. Write a
main class where you can accept payment using different methods.*/
interface PaymentMethod{
    void pay(double amount);
}
class CreditCardPayment implements PaymentMethod{
    public void pay(double amount){
        System.out.println("Paid "+amount+" using Credit card");
    }
}
class DebitCardPayment implements PaymentMethod{
    public void pay(double amount){
        System.out.println("Paid "+amount+" using Debit card");
    }
}
class UPIPayment implements PaymentMethod{
    public void pay(double amount){
        System.out.println("Paid "+amount+" using UPI");
    }
}
public class D7Two {
    public static void main(String[] args) {
        CreditCardPayment p1=new CreditCardPayment();
        p1.pay(6000);
        DebitCardPayment p2=new DebitCardPayment();
        p2.pay(7500);
        UPIPayment p3=new UPIPayment();
        p3.pay(65000);
    }
}
