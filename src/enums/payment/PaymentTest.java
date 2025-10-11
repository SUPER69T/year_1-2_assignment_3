package enums.payment;

public class PaymentTest { //רציתי להביא את האפשרות להריץ מספר גדול יותר של בדיקות וגם לנתר אחריהן..
    PaymentMethod[] method_Types = PaymentMethod.values();
    private Payment Payment1;
    private Payment Payment2;
    private Payment Payment3;
    public PaymentTest(){
    Payment1 = new Payment(1000*Math.random(), method_Types[(int)(5 * Math.random())]);
    Payment2 = new Payment(1000*Math.random(), method_Types[(int)(5 * Math.random())]);
    Payment3 = new Payment(1000*Math.random(), method_Types[(int)(5 * Math.random())]);
    Payment1.printPaymentDetails();
    Payment2.printPaymentDetails();
    Payment3.printPaymentDetails();
    }
}