
package package_project;


import java.util.ArrayList;
import java.util.List;


public class sell extends Client  {

    
    private double listingprice;
    private String salestatus;
    private  int listingdate;
    private int saledatte;
    
    
    
     public sell(String name, String email, int phone, String role) {
    super(); 
    setName(name);
    setEmail(email);
    setPhone(phone);
    setRole(role);
}
      public double getListingprice() {
        return listingprice;
    }

    public String  getSalestatus() {
        return salestatus;
    }

    public int getListingdate() {
        return listingdate;
    }

    public int getSaledatte() {
        return saledatte;
    }

    @Override
    public void input() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Enter the sell information: ");
        System.out.println("Enter the listingprice:");
        double listingprice= sc.nextDouble();
        System.out.println("Enter the Salestatus:");
        String Salestatus= sc.next();
        
         System.out.println("Enter the Listingdate:");
        int Listingdate= sc.nextInt();
        
         System.out.println("Enter the Saledatte:");
        int Saledatte= sc.nextInt();
        
        this.listingprice=listingprice;
        this.salestatus=salestatus;
        this.listingdate=listingdate;
        this.saledatte=saledatte;
    }

    @Override
    public void display() {
         System.out.println("Name: "+super.getName());
        System.out.println("Email : "+super.getEmail());
        System.out.println("phone : "+super.getPhone()); 
        System.out.println("role: " +super.getRole());
        System.out.println("Seller Information:"+listingprice+","+salestatus+","+listingdate+","+saledatte);
        
    }
    
private static ArrayList<sell> sellList = new ArrayList<>();

    public static void addSell() {
        sell newSell = new sell("", "", 0, "");
        newSell.input();
        sellList.add(newSell);
        System.out.println("Sell entry added successfully.");
    }

    public static void deleteSell(int index) {
        if (index >= 0 && index < sellList.size()) {
            sellList.remove(index);
            System.out.println("Sell entry deleted successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    public static void updateSell(int index) {
        if (index >= 0 && index < sellList.size()) {
            System.out.println("Enter new details for the sell entry:");
            sellList.get(index).input();
            System.out.println("Sell entry updated successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    public static void viewSell(int index) {
        if (index >= 0 && index < sellList.size()) {
            System.out.println("Details of the sell entry:");
            sellList.get(index).display();
        } else {
            System.out.println("Invalid index.");
        }
    }

    public static void viewAllSells() {
        if (sellList.isEmpty()) {
            System.out.println("No sell entries found.");
        } else {
            for (int i = 0; i < sellList.size(); i++) {
                System.out.println("Sell Entry " + (i + 1) + ":");
                sellList.get(i).display();
                System.out.println("---------------------------");
            }
        }
    

    }}
