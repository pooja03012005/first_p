package Program1;

public class Bank_customer {
    private String custName;
    private int customerId;
    private String customerAddress;

    public Bank_customer(String custName, int customerId, String customerAddress) {
        this.custName = custName;
        this.customerId = customerId;
        this.customerAddress = customerAddress;
    }

    public void displayCustomerDetails() {
        System.out.println("Customer Name is: " + custName);
        System.out.println("Customer ID is: " + customerId);
        System.out.println("Customer Address is: " + customerAddress);
    }

    public static void main(String[] args) {
        Bank_customer c = new Bank_customer("pooja", 1, "Hubli-20");
        c.displayCustomerDetails();
    }
}