//written by daniel rosman 211765565
package assignment_1_enums.payments;

// Enum representing different payment methods, each with a unique ID
public enum PaymentMethod {
    CREDIT_CARD(1),
    DEBIT_CARD(2),
    BANK_TRANSFER(3),
    PAYPAL(4),
    CASH(5);

    // Instance variable to store the unique ID of the payment method
    private final int uniqueId;

    // Constructor to initialize the payment method with its unique ID
    PaymentMethod(int uniqueId) {
        this.uniqueId = uniqueId;
    }

    //Getter
    public int getUniqueId() {
        return uniqueId;
    }
}
