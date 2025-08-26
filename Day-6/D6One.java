/*Illustrate the concept-Encapsulation with the Payment Gateway System.
[The class should encapsulate private data members such as transaction ID, payer name, payee name, amount, payment method, and transaction status.
 Provide appropriate public getter and setter methods to access and modify these details securely. Also include a method to display the transaction summary.] */
class paymentGateWay{
    private String transactionID;
    private String payerName;
    private String payeeName;
    private double amount;
    private String paymentMethod;
    private String transactionStatus;
    public void setTrasactionId(String transactionId){
        this.transactionID=transactionId;
    }
    public void setPayerName(String payerName){
        this.payerName=payerName;
    }
    public void setPayeeName(String PayeeName){
        this.payeeName=PayeeName;
    }
    public void setAmounnt(double amount){
        if(amount>0){
            this.amount=amount;
        }
        else{
            System.out.println("Invalid data");
        }
    }
    public void setPaymentMethod(String paymethod){
        this.paymentMethod=paymethod;
    }

    public void settransactionStatus(String transactionStatus){
        this.transactionStatus=transactionStatus;
    }
    String getTrasactionId(){
        return transactionID;
    }
    String getPayerName(){
        return payerName;
    }
    String getPayeeName(){
        return payeeName;
    }
    double getAmounnt(){
        return amount;
    }
    String getPaymentMethod(){
        return paymentMethod;
    }
    String getTransactionStatus(){
        return transactionStatus;
    }
    void dispalyTransaction(){
        System.out.println("Transaction ID: "+transactionID);
        System.out.println("Payer name: "+payerName);
        System.out.println("Reciver: "+payeeName);
        System.out.println("Amount: "+amount);
        System.out.println("Payment Method: "+paymentMethod);
        System.out.println("Transaction Status: "+transactionStatus);
    }
}
public class D6One {
    public static void main(String[] args) {
        paymentGateWay n=new paymentGateWay();
        n.setTrasactionId("IBFFJ7278289");
        n.setPayerName("Chiranjeevi");
        n.setPayeeName("Kalai");
        n.setAmounnt(60000);
        n.setPaymentMethod("UPI Transaction");
        n.settransactionStatus("Succesfull");
        n.dispalyTransaction();
    }
}
