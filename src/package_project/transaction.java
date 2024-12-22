
package package_project;




public class transaction implements Transactionn{
    private RealEstate property; 
    private Client client; 
    private Agent agent; 
    private double amount; 
    private int transactionDate; 
    private String paymentMethod; 
    private String transactionType; 
    
    
   
    
public transaction(){
super();
}
    
    public transaction(RealEstate property, Client client, Agent agent, double amount, String transactionType, String paymentMethod) {
        this.property = property;
        this.client = client;
        this.agent = agent;
        this.amount = amount;
        this.transactionDate = transactionDate ; 
        this.paymentMethod = paymentMethod;
        this.transactionType = transactionType;
    }

    // Getter and Setter methods
    public RealEstate getProperty() {
        return property;
    }

    

    public Client getClient() {
        return client;
    }

    

    public Agent getAgent() {
        return agent;
    }

   

    public double getAmount() {
        return amount;
    }

    

    public int getTransactionDate() {
        return transactionDate;
    }

   

    public String getPaymentMethod() {
        return paymentMethod;
    }

    
    public String getTransactionType() {
        return transactionType;
    }

    

   
    public void displayTransactionDetails() {
        System.out.println("Transaction Details:");
        System.out.println("Transaction Type: " + transactionType);
        System.out.println("Property: " + property.getlocation());
        System.out.println("Amount: $" + amount);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Transaction Date: " + transactionDate);
        System.out.println("Handled by Agent: " + agent.getName());
        System.out.println("Client: " + client.getName());
    }
    
    
}
