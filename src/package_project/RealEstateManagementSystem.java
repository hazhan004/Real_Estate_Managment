
package package_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class RealEstateManagementSystem {
    
       public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        RealEstate property = new RealEstate();
        Client client = new Client();
        Agent agent = new Agent();
        
        // Menu for selecting transaction type
        while (true) {
            System.out.println("\nTransaction System");
            System.out.println("1. Create Buy Transaction");
            System.out.println("2. Create Rent Transaction");
            System.out.println("3. View Transactions");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1: 
                    System.out.println("Creating Buy Transaction...");
                    System.out.print("Enter Amount: ");
                    double buyAmount = sc.nextDouble();
                    System.out.print("Enter Payment Method: ");
                    sc.nextLine();  // Consume newline
                    String buyPaymentMethod = sc.nextLine();
                    System.out.print("Enter Transaction Date (YYYYMMDD): ");
                    int buyTransactionDate = sc.nextInt();

                    BuyTransaction buyTransaction = new BuyTransaction(property, client, agent, buyAmount, buyTransactionDate, buyPaymentMethod);
                    buyTransaction.displayTransactionDetails();
                    break;

                case 2:
                    System.out.println("Creating Rent Transaction...");
                    System.out.print("Enter Amount: ");
                    double rentAmount = sc.nextDouble();
                    System.out.print("Enter Payment Method: ");
                    sc.nextLine();  // Consume newline
                    String rentPaymentMethod = sc.nextLine();
                    System.out.print("Enter Transaction Date (YYYYMMDD): ");
                    int rentTransactionDate = sc.nextInt();

                    RentTransaction rentTransaction = new RentTransaction(property, client, agent, rentAmount, rentTransactionDate, rentPaymentMethod);
                    rentTransaction.displayTransactionDetails();
                    break;

                case 3:
                    System.out.println("Viewing all transactions...");
                    // Here, you could call methods to view all transactions if they were stored in a list or database
                    // For simplicity, this can just display the details of the last created transaction
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return; // Exit the program

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
       
       /*
     List<RealEstate> properties = new ArrayList<>();
        boolean exit = false;

        while (!exit) {
            System.out.println("\nReal Estate Management System");
            System.out.println("1. Add Property");
            System.out.println("2. Delete Property");
            System.out.println("3. Update Property");
            System.out.println("4. Select Property");
            System.out.println("5. View All Properties");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nAdding a new property...");
                    RealEstate newProperty = new RealEstate();
                    newProperty.addProperty(properties);
                    break;
                case 2:
                    System.out.println("\nDeleting a property...");
                    System.out.print("Enter the property ID to delete: ");
                    int deleteId = sc.nextInt();
                    new RealEstate().deleteProperty(properties, deleteId);
                    break;
                case 3:
                    System.out.println("\nUpdating a property...");
                    System.out.print("Enter the property ID to update: ");
                    int updateId = sc.nextInt();
                    new RealEstate().updateProperty(properties, updateId);
                    break;
                case 4:
                    System.out.println("\nSelecting a property...");
                    System.out.print("Enter the property ID to view: ");
                    int selectId = sc.nextInt();
                    new RealEstate().selectProperty(properties, selectId);
                    break;
                case 5:
                    System.out.println("\nViewing all properties...");
                    new RealEstate().viewAllProperties(properties);
                    break;
                case 6:
                    System.out.println("Exiting the system. Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid menu option.");
            }
        }

        
    

       System.out.println("Enter the property type:-");
         System.out.println("1-home,2-land,3-villa,4-office,5-apartment");
         int op=sc.nextInt();
         
         switch(op) {
            case 1:
                System.out.println("You selected: Home");
                
                List<home> homes = new ArrayList<>();
                boolean exitt = false;

        while (!exitt) {
            System.out.println("\nHome Management System");
            System.out.println("1. Add Home");
            System.out.println("2. Delete Home");
            System.out.println("3. Update Home");
            System.out.println("4. Select Home");
            System.out.println("5. View All Homes");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nAdding a new home...");
                    home newHome = new home(0, "", 0); // Temporary initialization
                    newHome.addHome(homes);
                    break;
                case 2:
                    System.out.println("\nDeleting a home...");
                    System.out.print("Enter the home ID to delete: ");
                    int deleteId = sc.nextInt();
                    new home(0, "", 0).deleteHome(homes, deleteId);
                    break;
                case 3:
                    System.out.println("\nUpdating a home...");
                    System.out.print("Enter the home ID to update: ");
                    int updateId = sc.nextInt();
                    new home(0, "", 0).updateHome(homes, updateId);
                    break;
                case 4:
                    System.out.println("\nSelecting a home...");
                    System.out.print("Enter the home ID to view: ");
                    int selectId = sc.nextInt();
                    new home(0, "", 0).selectHome(homes, selectId);
                    break;
                case 5:
                    System.out.println("\nViewing all homes...");
                    new home(0, "", 0).viewAllHomes(homes);
                    break;
                case 6:
                    System.out.println("Exiting the system. Goodbye!");
                    exitt = true;
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid menu option.");
            }
        
        } 
        break;
         
                
        /*        
            case 2:
                System.out.println("You selected: Land");
                 land land1 = new land(real.getid(), real.getlocation(), real.getprice());
                 land1.input();
                 land1.display();
                break;
            case 3:
                System.out.println("You selected: Villa");
                villa villa1 = new villa(real.getid(), real.getlocation(), real.getprice());
                villa1.input();
                villa1.display();
                
                break;
            case 4:
                System.out.println("You selected: Office");
                office office1 = new office(real.getid(), real.getlocation(), real.getprice());
                office1.input();
                office1.display();
                break;
            case 5:
                System.out.println("You selected: Apartment");
                 apartment apartment1 = new apartment(real.getid(), real.getlocation(), real.getprice());
                 apartment1.input();
                 apartment1.display();
                break;
                default:
                System.out.println("Invalid selection! Please choose a number between 1 and 5.");
                break;
   
        
         }
        
        
                
           
        person person1=new person();
        person1.input();
        
         System.out.println("Eter the work:-");
         System.out.println("1-Agent,2-Client");
         int opp=sc.nextInt();
        
        
         
         
         switch(opp) {
            case 1:
                System.out.println("You selected: Agent");
                Agent agent1=new Agent(person1.getName(), person1.getEmail(), person1.getPhone());
                agent1.input();
                agent1.display();
                
                
                int oppp=sc.nextInt();
                switch(oppp) {
            case 1:
                System.out.println("You selected: admin");
                System.out.println("Admin informathion");
                Admin admin1=new Admin(person1.getName(), person1.getEmail(), person1.getPhone(),agent1.getLicensenumber());
                admin1.input();
                admin1.display();
                break;
                default:
                System.out.println("Invalid selection! Please choose 1");
                break;
                }
                
                break;
            case 2:
                System.out.println("You selected: Client");
                 Client client1=new Client(person1.getName(), person1.getEmail(), person1.getPhone());
                client1.input();
                client1.display();
                
                System.out.print("Enter role:1-sell,2-buy,3-rent ");
                String role = sc.next();
        
        switch(role){
        
            case "sell":
                sell sell2=new sell(person1.getName(), person1.getEmail(), person1.getPhone(),client1.getRole());
                sell2.input();
                sell2.display();
                break;
                
                case "buy":
                 buy buy1=new buy(person1.getName(), person1.getEmail(), person1.getPhone(),client1.getRole());
                buy1.input();
                buy1.display();
                break;
                
                case "rent":
                rent rent1=new rent(person1.getName(), person1.getEmail(), person1.getPhone(),client1.getRole());
                rent1.input();
                rent1.display();
                break;
 
                default:
                System.out.println("Invalid selection! Please choose a role");
                break;
         }
       }*/

       }
         
       

 

               

      



 
 

 

 


 
 
 

 

       
       
    









