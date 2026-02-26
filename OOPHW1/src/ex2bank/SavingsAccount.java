//211765565 daniel rosman

package ex2bank;

public class SavingsAccount {
    // Private fields representing saving account annualInterestRate , accountCounter , accountNumber ,accountHolder ,savingsBalance
    private static double annualInterestRate;
    private static int accountCounter=1000;

    private final int accountNumber;
    private PersonId accountHolder;
    private double savingsBalance;

    //Constructor to initialize a SavingsAccount with an account holder and initial savings balance.
    public SavingsAccount(PersonId accountHolder, double savingsBalance) {
        this.accountNumber = accountCounter++; // Assign the current account counter value and increment it
        this.accountHolder = accountHolder;
        this.savingsBalance = savingsBalance;
    }
    //Constructor to initialize a SavingsAccount with an account holder and default savings balance (0).
    public SavingsAccount(PersonId accountHolder) {
        this(accountHolder, 0);
    }

    //Method to calculate monthly interest and update the savings balance. Interest is calculated based on the annual interest rate.
    public void calculateMonthlyInterest() {
        savingsBalance += (savingsBalance * annualInterestRate / 12);
    }

    //Static method to modify the annual interest rate for all savings accounts
    public static void modifyInterestRate(double newInterestRate) {
        if (newInterestRate >= -1 && newInterestRate <= 1) {
            annualInterestRate = newInterestRate;
        } else {
            throw new IllegalArgumentException("Interest rate must be between -1 and 1.");
        }
    }


    //toString method to return a string representation of the SavingsAccount object
    @Override
    public String toString() {
        return "accountNumber=" + accountNumber +
                ", accountHolder=" + accountHolder +
                ", savingsBalance=" + savingsBalance +
                '}';
    }


    //Equals method to compare two SavingsAccount objects based on their account numbers.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SavingsAccount that = (SavingsAccount) o;
        return accountNumber == that.accountNumber;
    }

    //static getter and setter methods
    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public static int getAccountCounter() {
        return accountCounter;
    }

    public static void setAccountCounter(int accountCounter) {
        SavingsAccount.accountCounter = accountCounter;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public PersonId getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(PersonId accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
}
