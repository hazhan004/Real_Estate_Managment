/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package_project;

/**
 *
 * @author Sherdll Store
 */
public interface Transactionn {
    RealEstate getProperty(); // Getter for property
    Client getClient(); // Getter for client
    Agent getAgent(); // Getter for agent
    double getAmount(); // Getter for amount
    int getTransactionDate(); // Getter for transaction date
    String getPaymentMethod(); // Getter for payment method
    String getTransactionType(); // Getter for transaction type
    
    void displayTransactionDetails();
}
