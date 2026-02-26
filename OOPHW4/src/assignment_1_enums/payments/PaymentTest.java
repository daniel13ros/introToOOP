//written by daniel rosman 211765565
package assignment_1_enums.payments;

public class PaymentTest {

    public static void main(String[] args) {
    runTest1();

    }
    //Static method that testing the payment enum
    public static void runTest1(){
        Payment payment1=new Payment(250.3,PaymentMethod.DEBIT_CARD);
        Payment payment2=new Payment(3526.4,PaymentMethod.PAYPAL);
        Payment payment3=new Payment(12.8,PaymentMethod.CASH);

        System.out.println("Payment 1 details: ");
        payment1.printPaymentDetails();
        System.out.println("\nPayment 2 details: ");
        payment2.printPaymentDetails();
        System.out.println("\nPayment 3 details: ");
        payment3.printPaymentDetails();
    }
}
