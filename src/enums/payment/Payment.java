package enums.payment;

public class Payment {
    private double amount;
    private PaymentMethod method;
    String referenceNumber = "REF";
    public Payment(double amount, PaymentMethod method){
        this.amount = amount;
        this.method = method;
        this.referenceNumber += (int)(Math.random() * (1000000 - 100000) + 100000);
    }
    public void printPaymentDetails(){
        String shortened_amount = String.format("%.2f", this.amount);
        System.out.println("Amount: " + shortened_amount + ", Payment type: " + this.method + ", reference_ID: " + this.referenceNumber + ".");
    }
}
