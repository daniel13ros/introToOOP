//written by daniel rosman 211765565
package assignment_1_enums.payments;

// Class representing a payment with amount, method, and reference number
public class Payment {

    // Instance variables to store the payment amount, method, and reference number
    private double amount;
    private PaymentMethod method;
    private String referenceNumber;

    // Constructor to initialize the payment with a specified amount and method
    public Payment(double amount, PaymentMethod method) {
        this.amount = amount;
        this.method = method;
        this.referenceNumber=randomReferenceNumber();
    }

    // Method to print the details of the payment
    public void printPaymentDetails(){
        System.out.println("_______________________________");
        System.out.println("Total of payment: "+this.amount);
        System.out.println("Payment Method: "+this.method.name());
        System.out.println("Reference Number: "+this.referenceNumber);
    }

    // Static method to generate a random reference number
    public static String randomReferenceNumber(){
        StringBuilder number=new StringBuilder();
        for(int i=0;i<=5;i++){
            number.append((int)(Math.random()*10));

        }
        return "REF"+number;
    }
}
