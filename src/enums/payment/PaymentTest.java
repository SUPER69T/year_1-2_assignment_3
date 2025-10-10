import enums.payment.Payment;
import enums.payment.PaymentMethod;

public class PaymentTest {
    private Payment Payment1;
    private Payment Payment2;
    private Payment Payment3;
    public PaymentTest(){
    Payment1 = new Payment((int)100*Math.random(), PaymentMethod.CASH);
    Payment2 = new Payment((int)100*Math.random(), PaymentMethod.CREDIT_CARD);
    Payment3 = new Payment((int)100*Math.random(), PaymentMethod.DEBIT_CARD);
    Payment1.printPaymentDetails();
    Payment2.printPaymentDetails();
    Payment3.printPaymentDetails();
    }
}