
package package_project;


import java.util.Scanner;



 public class home extends RealEstate{
     
     private double area;
     private int numberOfRooms;
     private String address;
     private int bathrooms;
     private int bedrooms;
     private int floors;

     
    public home(int id,String location,double price) {
        super.setid(id);
        super.setlocation(location);
        super.setprice(price);
        
    }


public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public String getAddress() {
        return address;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public int getBedroom() {
        return bedrooms;
    }

    
 public int getFloors() {
        return floors;
    }
   
   
    
     @Override
    public void input() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the Address: ");
        String Address = sc.next();
        System.out.print("Enter number of rooms: ");
        int numberOfRooms = sc.nextInt();
        System.out.print("Enter number of bathrooms: ");
        int bathrooms = sc.nextInt();
        System.out.print("Enter number of bedrooms: ");
        int bedrooms = sc.nextInt();
        System.out.print("Enter number of floors: ");
        int floors = sc.nextInt();
        System.out.print("Enter number of area: ");
                int area = sc.nextInt();

        this.area=area;
        this.numberOfRooms =numberOfRooms ;
        this.address=Address;
        this.bathrooms=bathrooms;
        this.bedrooms=bedrooms;
        this.floors=floors;
        
    }
    
    @Override
    public void display() {
        System.out.println("ID : "+super.getid());
        System.out.println("location : "+super.getlocation());
        System.out.println("price : "+super.getprice());
        
        
        System.out.println("Address: " +address );
        System.out.println("Number of Rooms: " + numberOfRooms);
        System.out.println("Number of bathRooms: " + bathrooms);
        System.out.println("Number of bedRooms: " +bedrooms);
        System.out.println("Number of floors: " + floors);
    }
    
    
    public void addHome(java.util.List<home> homes) {
        input();
        homes.add(this);
        System.out.println("Home added successfully.");
    }

    public void deleteHome(java.util.List<home> homes, int homeId) {
        boolean removed = homes.removeIf(home -> home.getid() == homeId);
        if (removed) {
            System.out.println("Home deleted successfully.");
        } else {
            System.out.println("Home not found.");
        }
    }

    public void updateHome(java.util.List<home> homes, int homeId) {
        for (home h : homes) {
            if (h.getid() == homeId) {
                System.out.println("Updating home details...");
                input();
                h.setid(super.getid());
                h.setlocation(super.getlocation());
                h.setprice(super.getprice());
                h.address = this.address;
                h.numberOfRooms = this.numberOfRooms;
                h.bathrooms = this.bathrooms;
                h.bedrooms = this.bedrooms;
                h.floors = this.floors;
                h.area = this.area;
                System.out.println("Home updated successfully.");
                return;
            }
        }
        System.out.println("Home not found.");
    }

    public void selectHome(java.util.List<home> homes, int homeId) {
        for (home h : homes) {
            if (h.getid() == homeId) {
                System.out.println("Home found:");
                h.display();
                return;
            }
        }
        System.out.println("Home not found.");
    }

    public void viewAllHomes(java.util.List<home> homes) {
        if (homes.isEmpty()) {
            System.out.println("No homes available.");
        } else {
            System.out.println("Listing all homes:");
            for (home h : homes) {
                h.display();
                System.out.println("--------------------");
            }
        }
    }
    


        }


