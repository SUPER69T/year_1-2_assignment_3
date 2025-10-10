package enums.payment;

public class Payment {
    private double amount;
    private PaymentMethod method;
    String referenceNumber = "REF";
    public Payment(double amount, PaymentMethod method){
        this.amount = (int) amount;
        this.method = method;
        for(int i = 0 ; i < 6 ; i++){
            this.referenceNumber += Math.random();
        }
    }
    public void printPaymentDetails(){
        System.out.println("Amount: " + this.amount + "Payment type: " + this.method + "reference_ID: " + this.referenceNumber);
    }
}
