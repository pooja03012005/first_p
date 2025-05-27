package Program1;

public class Bank_transaction {
    String account_name;
    String accountholder_name;
    String account_type;
    String account_number;
    float balance;

    Bank_transaction(String account_name, String accountholder_name, String account_type, String account_number, float balance) {
        this.account_name = account_name;
        this.accountholder_name = accountholder_name;
        this.account_type = account_type;
        this.account_number = account_number;
        this.balance  = balance;
    }

    void Display_Transaction_details() {
        System.out.println("Account name is: " + account_name);
        System.out.println("Account holder name is: " + accountholder_name);
        System.out.println("Account type is: " + account_type);
        System.out.println("Account number is: " + account_number);
        System.out.println("Account balance is: " + balance);
    }

    public static void main(String[] args) {
        Bank_transaction t = new Bank_transaction("SBI", "Pooja", "savings", "1234567890", 60.00f);
        t.Display_Transaction_details();
    }
}