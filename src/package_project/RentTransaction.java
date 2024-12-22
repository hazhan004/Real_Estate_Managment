
package package_project;


public class RentTransaction implements Transactionn{
    private RealEstate property;
    private Client client;
    private Agent agent;
    private double amount;
    private int transactionDate;
    private String paymentMethod;
    private String transactionType = "Rent";

    public RentTransaction(RealEstate property, Client client, Agent agent, double amount, int transactionDate, String paymentMethod) {
        this.property = property;
        this.client = client;
        this.agent = agent;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.paymentMethod = paymentMethod;
    }

    @Override
    public RealEstate getProperty() {
        return property;
    }

    @Override
    public Client getClient() {
        return client;
    }

    @Override
    public Agent getAgent() {
        return agent;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public int getTransactionDate() {
        return transactionDate;
    }

    @Override
    public String getPaymentMethod() {
        return paymentMethod;
    }

    @Override
    public String getTransactionType() {
        return transactionType;
    }

    @Override
    public void displayTransactionDetails() {
        System.out.println("Rent Transaction Details:");
        System.out.println("Property: " + property.getlocation());
        System.out.println("Amount: $" + amount);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Transaction Date: " + transactionDate);
        System.out.println("Handled by Agent: " + agent.getName());
        System.out.println("Client: " + client.getName());
    }
}
