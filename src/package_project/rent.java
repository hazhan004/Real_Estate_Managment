
package package_project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class rent extends Client{
    
   private int propertyId;        
    private double rentalPrice;       
    private int rentalDuration;       

  private static ArrayList<rent> rentalList = new ArrayList<>();
     public rent(String name, String email, int phone, String role) {
    super(); 
    setName(name);
    setEmail(email);
    setPhone(phone);
    setRole(role);
}

    
    public int getPropertyId() {
        return propertyId;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public int getRentalDuration() {
        return rentalDuration;
    }

     @Override
    public void input() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter Property ID: ");
        int propertyId = sc.nextInt();
        System.out.print("Enter Rental Price: ");
        double rentalPrice = sc.nextDouble();
        System.out.print("Enter Rental Duration (months): ");
        int rentalDuration = sc.nextInt();
        
         this.rentalDuration=rentalDuration;
         this.rentalPrice=rentalPrice;
         this.propertyId=propertyId;
        
    }

    @Override
    public void display() {
        
        System.out.println("Rental Details:");
        System.out.println("Name: "+super.getName());
        System.out.println("Email : "+super.getEmail());
        System.out.println("phone : "+super.getPhone()); 
        System.out.println("role: " +super.getRole());
        System.out.println("Property ID: " + propertyId);
        System.out.println("Rental Price: $" + rentalPrice);
        System.out.println("Rental Duration: " + rentalDuration + " months");
    }
    
    public static void addRental() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        System.out.print("Enter Phone: ");
        int phone = sc.nextInt();
        sc.nextLine();  // Consume newline
        System.out.print("Enter Role: ");
        String role = sc.nextLine();

        rent newRental = new rent(name, email, phone, role);
        newRental.input();
        rentalList.add(newRental);
        System.out.println("Rental entry added successfully!");
    }

    // Delete a rental by property ID
    public static void deleteRental(int propertyId) {
        Iterator<rent> iterator = rentalList.iterator();
        while (iterator.hasNext()) {
            rent rental = iterator.next();
            if (rental.getPropertyId() == propertyId) {
                iterator.remove();
                System.out.println("Rental entry deleted successfully!");
                return;
            }
        }
        System.out.println("Rental not found.");
    }

    // Update a rental entry by property ID
    public static void updateRental(int propertyId) {
        for (rent rental : rentalList) {
            if (rental.getPropertyId() == propertyId) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Updating Rental Entry for Property ID: " + rental.getPropertyId());
                System.out.print("Enter new Rental Price: ");
                double newPrice = sc.nextDouble();
                System.out.print("Enter new Rental Duration (months): ");
                int newDuration = sc.nextInt();

                rental.rentalPrice = newPrice;
                rental.rentalDuration = newDuration;
                System.out.println("Rental entry updated successfully!");
                return;
            }
        }
        System.out.println("Rental entry not found.");
    }

    // Select a rental by property ID
    public static rent selectRental(int propertyId) {
        for (rent rental : rentalList) {
            if (rental.getPropertyId() == propertyId) {
                return rental;
            }
        }
        System.out.println("Rental entry not found.");
        return null;
    }

    // View all rental entries
    public static void viewAllRentals() {
        if (rentalList.isEmpty()) {
            System.out.println("No rental entries available.");
        } else {
            for (rent rental : rentalList) {
                rental.display();
                System.out.println("------------------------------------");
            }
        }

   
    }
}
  

