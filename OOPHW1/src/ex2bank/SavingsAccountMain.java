//211765565 daniel rosman

package ex2bank;

public class SavingsAccountMain {
    public static void main(String[] args) {
        // Define an array of 10 clients of type PersonId and initialize 2-3 clients
        PersonId[] personIds = new PersonId[10];
        personIds[0] = new PersonId(5000, "Bill", "Gates", "Tel-Aviv");
        personIds[1] = new PersonId(6000, "Mark", "Zuckerberg", "Jerusalem");
        personIds[2] = new PersonId(7000, "Steve", "Jobs", "Beer-Sheva");

        // Print list of clients with all their details
        System.out.println("List of clients:");
        for (PersonId personId : personIds) {
            if (personId != null) {
                System.out.println(personId);
            }
        }

        // Define an array of 10 accounts of type SavingsAccount and initialize 3 accounts
        SavingsAccount[] accounts = new SavingsAccount[10];
        accounts[0] = new SavingsAccount(personIds[1], 2000);
        accounts[1] = new SavingsAccount(personIds[2], 3000);
        accounts[2] = new SavingsAccount(personIds[0], 4000);

        // Set the annual interest rate to 1% (0.01)
        SavingsAccount.modifyInterestRate(0.01);

        // Calculate the monthly interest and print the new balances for each account for two months
        for (int i = 0; i < 2; i++) {
            for (SavingsAccount account : accounts) {
                if (account != null) {
                    account.calculateMonthlyInterest();
                }
            }
        }

        // Print account status after two month update
        System.out.println("Account status after two month update of balance (monthly interest: 0.01):");
        for (SavingsAccount account : accounts) {
            if (account != null) {
                System.out.println(account);
            }
        }

        // Set the annual interest rate to -1.5% (-0.015)
        SavingsAccount.modifyInterestRate(-0.015);

        // Calculate the monthly interest for the next month and print the new balances for each account
        for (SavingsAccount account : accounts) {
            if (account != null) {
                account.calculateMonthlyInterest();
            }
        }

        // Print account status after one month update with new interest rate
        System.out.println("Account status after one month update of balance (monthly interest now -0.015):");
        for (SavingsAccount account : accounts) {
            if (account != null) {
                System.out.println(account);
            }
        }
    }
}
