/**
 * Client
 * Uses the interface, doesn’t care whether it’s proxy or real.
 */
public class Application {
  public static void main(String[] args) {
    BankAccount bankAccount = new ATMProxy();

    // Note: Client doesn't know whether it's proxy or real

    // Withdraw amount
    bankAccount.withdraw(1000.0);

    // Check bank balance
    System.out.println("Balance: " + bankAccount.getBalance());
  }
}
