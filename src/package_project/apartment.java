
package package_project;


public class apartment extends RealEstate {
    
    private int floorNumber;
     private int bedrooms;
     private int bathrooms;
     private double rent;
     private boolean hasbalcony;
     private boolean isavailable;
     
     public apartment(int id,String location,double price) {
        super.setid(id);
        super.setlocation(location);
        super.setprice(price);
        
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public double getRent() {
        return rent;
    }

    public boolean isHasbalcony() {
        return hasbalcony;
    }

    public boolean isIsavailable() {
        return isavailable;
    }
     
   
    
      @Override
    public void input() {
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter floor number: ");
        int floorNumber = sc.nextInt();
        
        System.out.print("Enter bathrooms number: ");
        int bathrooms = sc.nextInt();
        
        System.out.print("Enter bedrooms number: ");
        int bedrooms = sc.nextInt();
        
        System.out.print("Enter rent: ");
        double rent = sc.nextDouble();
        
        System.out.print("hasbalcony: (yes,no)");
        boolean hasbalcony = sc.hasNextBoolean();
        
        System.out.print("isavailable: (true,false)");
        boolean isavailable = sc.hasNextBoolean();
        
        this.floorNumber=floorNumber;
        this.bathrooms=bathrooms;
        this.bedrooms=bedrooms;
        this.rent=rent;
        this.hasbalcony=hasbalcony;
        this.isavailable=isavailable;
        
    }

    @Override
    public void display() {
        System.out.println("ID : "+super.getid());
        System.out.println("location : "+super.getlocation());
        System.out.println("price : "+super.getprice());
        System.out.println("Floor Number: " + floorNumber);
        System.out.println("bathrooms: " + bathrooms);
        System.out.println("bedrooms: " + bedrooms);
        System.out.println("rent: " + rent);
        System.out.println("hasbalcony: " + hasbalcony);
        System.out.println("isavailable: " + isavailable);
        
    }
public void addApartment(java.util.List<apartment> apartments) {
        input();
        apartments.add(this);
        System.out.println("Apartment added successfully.");
    }

    public void deleteApartment(java.util.List<apartment> apartments, int apartmentId) {
        boolean removed = apartments.removeIf(apartment -> apartment.getid() == apartmentId);
        if (removed) {
            System.out.println("Apartment deleted successfully.");
        } else {
            System.out.println("Apartment not found.");
        }
    }

    public void updateApartment(java.util.List<apartment> apartments, int apartmentId) {
        for (apartment apt : apartments) {
            if (apt.getid() == apartmentId) {
                System.out.println("Updating apartment details...");
                input();
                apt.setid(this.getid());
                apt.setlocation(this.getlocation());
                apt.setprice(this.getprice());
                apt.floorNumber = this.floorNumber;
                apt.bathrooms = this.bathrooms;
                apt.bedrooms = this.bedrooms;
                apt.rent = this.rent;
                apt.hasbalcony = this.hasbalcony;
                apt.isavailable = this.isavailable;
                System.out.println("Apartment updated successfully.");
                return;
            }
        }
        System.out.println("Apartment not found.");
    }

    public void selectApartment(java.util.List<apartment> apartments, int apartmentId) {
        for (apartment apt : apartments) {
            if (apt.getid() == apartmentId) {
                System.out.println("Apartment found:");
                apt.display();
                return;
            }
        }
        System.out.println("Apartment not found.");
    }

    public void viewAllApartments(java.util.List<apartment> apartments) {
        if (apartments.isEmpty()) {
            System.out.println("No apartments available.");
        } else {
            System.out.println("Listing all apartments:");
            for (apartment apt : apartments) {
                apt.display();
                System.out.println("--------------------");
            }
        }
    }
    
}


