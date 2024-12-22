
package package_project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class buy extends Client{

    public void setDesiredPropertyType(String desiredPropertyType) {
        this.desiredPropertyType = desiredPropertyType;
    }
     private String desiredPropertyType;

     private static ArrayList<buy> buyersList = new ArrayList<>();
     
   public buy(String name, String email, int phone, String role) {
    super(); 
    setName(name);
    setEmail(email);
    setPhone(phone);
    setRole(role);
}

    public String getDesiredPropertyType() {
        return desiredPropertyType;
    }

      @Override
    public void input() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter Desired Property Type: ");
        String desiredPropertyType = sc.nextLine();
        this.desiredPropertyType=desiredPropertyType;
    }

    @Override
    public void display() {
        System.out.println("Buyer Specific Details:");
        System.out.println("Name: "+super.getName());
        System.out.println("Email : "+super.getEmail());
        System.out.println("phone : "+super.getPhone()); 
        System.out.println("role: " +super.getRole());
        System.out.println("Desired Property Type: " + desiredPropertyType);
    }
     
    public static void addBuyer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        System.out.print("Enter Phone: ");
        int phone = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Role: ");
        String role = sc.nextLine();

        buy newBuyer = new buy(name, email, phone, role);
        newBuyer.input();
        buyersList.add(newBuyer);
        System.out.println("Buyer added successfully!");
    }

    // Delete a buyer by email
    public static void deleteBuyer(String email) {
        Iterator<buy> iterator = buyersList.iterator();
        while (iterator.hasNext()) {
            buy buyer = iterator.next();
            if (buyer.getEmail().equals(email)) {
                iterator.remove();
                System.out.println("Buyer deleted successfully!");
                return;
            }
        }
        System.out.println("Buyer not found.");
    }

    // Update a buyer's details by email
    public static void updateBuyer(String email) {
        for (buy buyer : buyersList) {
            if (buyer.getEmail().equals(email)) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Updating Buyer: " + buyer.getName());
                System.out.print("Enter new Desired Property Type: ");
                String newPropertyType = sc.nextLine();
                buyer.setDesiredPropertyType(newPropertyType);
                System.out.println("Buyer details updated successfully!");
                return;
            }
        }
        System.out.println("Buyer not found.");
    }

    // Select a buyer by name or email
    public static buy selectBuyer(String searchTerm) {
        for (buy buyer : buyersList) {
            if (buyer.getName().equalsIgnoreCase(searchTerm) || buyer.getEmail().equalsIgnoreCase(searchTerm)) {
                return buyer;
            }
        }
        System.out.println("Buyer not found.");
        return null;
    }

    // View all buyers
    public static void viewAllBuyers() {
        if (buyersList.isEmpty()) {
            System.out.println("No buyers available.");
        } else {
            for (buy buyer : buyersList) {
                buyer.display();
                System.out.println("------------------------------------");
            }
        }

    }
    
    

}

     

