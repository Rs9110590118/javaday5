
import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    String accountHolderName;
    double balance;

    String getAccountNumber() {
        return accountNumber;
    }

    void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    void display() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Balance: " + balance);
    }
}

 class Acout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount b = new BankAccount();

        System.out.print("Enter Account Holder Name: ");
        b.accountHolderName = sc.nextLine();

        System.out.print("Enter Account Number: ");
        b.setAccountNumber(sc.nextLine());

        System.out.print("Enter Account Balance: ");
        b.balance = sc.nextDouble();

        System.out.println("Bank Account Details");
        b.display();

        sc.nextLine();

        System.out.println(" Update Account Number");
        System.out.print("Enter New Account Number: ");
        String newNumber = sc.nextLine();

        b.setAccountNumber(newNumber);

        System.out.println("Updated Account Number: " + b.getAccountNumber());

        System.out.println(" Updated Account Details ");
        b.display();

        
    }
}