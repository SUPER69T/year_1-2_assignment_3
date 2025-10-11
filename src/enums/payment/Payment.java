package enums.payment;

public class Payment {
    private double amount;
    private PaymentMethod method;
    String referenceNumber = "REF";
    public Payment(double amount, PaymentMethod method){
        this.amount = amount;
        this.method = method;
        for(int i = 0 ; i < 6 ; i++){
            this.referenceNumber += (int)(10 * Math.random());
        }
    }
    public void printPaymentDetails(){
        String shortened_amount = String.format("%.2f", this.amount);
        System.out.println("Amount: " + shortened_amount + ", Payment type: " + this.method + ", reference_ID: " + this.referenceNumber + ".");
    }
}
