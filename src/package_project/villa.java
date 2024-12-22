
package package_project;

import java.util.List;


public class villa extends RealEstate{
    
    private boolean hasswimmingPool;
     private boolean hasgarden;
     private boolean hasgarage;
     private boolean isfurnished;
     private boolean hasprivatesecurity;
     private double area;
     private String address;
     private int bathrooms;
     private int bedrooms;
     private int floors;
     private int numberOfRooms;
     private String villastyle;
     
     public villa(int id,String location,double price) {
        super.setid(id);
        super.setlocation(location);
        super.setprice(price);
        
    }

    public boolean isHasswimmingPool() {
        return hasswimmingPool;
    }

    public boolean isHasgarden() {
        return hasgarden;
    }

    public boolean isHasgarage() {
        return hasgarage;
    }

    public boolean isIsfurnished() {
        return isfurnished;
    }

    public boolean isHasprivatesecurity() {
        return hasprivatesecurity;
    }

    public double getArea() {
        return area;
    }

    public String getAddress() {
        return address;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getFloors() {
        return floors;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public String getVillastyle() {
        return villastyle;
    }
     
     
   
      @Override
    public void input() {
       
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Enter the address: ");
        String address = sc.next();
        
        System.out.print("Enter the area: ");
        double area = sc.nextDouble();
        
        System.out.print("Enter the floors: ");
        int floors = sc.nextInt();
        
        System.out.print("Enter the villastyle: ");
        String villastyle = sc.next();
        
        System.out.print("Has hasswimmingPool (true/false): ");
        boolean hasswimmingPool = sc.nextBoolean();
        
        System.out.print("Has hasprivatesecurity (true/false): ");
        boolean hasprivatesecurity = sc.nextBoolean();
        
        System.out.print("Has isfurnished (true/false): ");
        boolean isfurnished = sc.nextBoolean();
        
        System.out.print("Has hasgarden (true/false): ");
        boolean hasgarden = sc.nextBoolean();
        
        System.out.print("Has hasgarage(true/false): ");
        boolean hasgarage = sc.nextBoolean();
        
        System.out.print("Enter the numberOfRooms: ");
        int numberOfRooms = sc.nextInt();
        
        System.out.print("Enter the bathrooms: ");
        int bathrooms = sc.nextInt();
        
        System.out.print("Enter the bedrooms: ");
        int bedrooms = sc.nextInt();
        
        
        
        this.address=address;
        this.area=area;
        this.floors=floors;
        this.hasswimmingPool=hasswimmingPool;
        this.hasprivatesecurity=hasprivatesecurity;
        this.isfurnished=isfurnished;
        this.villastyle=villastyle;
        this.hasgarden=hasgarden;
        this.hasgarage=hasgarage;
        this.numberOfRooms=numberOfRooms;
        this.bathrooms=bathrooms;
        this.bedrooms=bedrooms;
        
    }

    @Override
    public void display() {
        System.out.println("ID : "+super.getid());
        System.out.println("location : "+super.getlocation());
        System.out.println("price : "+super.getprice());
        System.out.println("address: " + address);
        System.out.println("area: " + area);
        System.out.println("floors: " + floors);
        System.out.println("villastyle: " + villastyle);
        System.out.println("hasswimmingPool: " + hasswimmingPool);
        System.out.println("hasprivatesecurity: " + hasprivatesecurity);
        System.out.println("isfurnished: " + isfurnished);
        System.out.println("hasgarden: " + hasgarden);
        System.out.println("hasgarage: " + hasgarage);
        System.out.println("numberOfRooms: " + numberOfRooms);
        System.out.println("bathrooms: " + bathrooms);
        System.out.println("bedrooms: " + bedrooms);
        
    }
    public void addVilla(java.util.List<villa> villas) {
        input();
        villas.add(this);
        System.out.println("Villa added successfully.");
    }

    public void deleteVilla(java.util.List<villa> villas, int villaId) {
        boolean removed = villas.removeIf(v -> v.getid() == villaId);
        if (removed) {
            System.out.println("Villa deleted successfully.");
        } else {
            System.out.println("Villa not found.");
        }
    }

    public void updateVilla(java.util.List<villa> villas, int villaId) {
        for (villa v : villas) {
            if (v.getid() == villaId) {
                System.out.println("Updating villa details...");
                input();
                v.setid(this.getid());
                v.setlocation(this.getlocation());
                v.setprice(this.getprice());
                v.address = this.address;
                v.area = this.area;
                v.floors = this.floors;
                v.hasswimmingPool = this.hasswimmingPool;
                v.hasprivatesecurity = this.hasprivatesecurity;
                v.isfurnished = this.isfurnished;
                v.villastyle = this.villastyle;
                v.hasgarden = this.hasgarden;
                v.hasgarage = this.hasgarage;
                v.numberOfRooms = this.numberOfRooms;
                v.bathrooms = this.bathrooms;
                v.bedrooms = this.bedrooms;
                System.out.println("Villa updated successfully.");
                return;
            }
        }
        System.out.println("Villa not found.");
    }

    public void selectVilla(java.util.List<villa> villas, int villaId) {
        for (villa v : villas) {
            if (v.getid() == villaId) {
                System.out.println("Villa found:");
                v.display();
                return;
            }
        }
        System.out.println("Villa not found.");
    }

    public void viewAllVillas(java.util.List<villa> villas) {
        if (villas.isEmpty()) {
            System.out.println("No villas available.");
        } else {
            System.out.println("Listing all villas:");
            for (villa v : villas) {
                v.display();
                System.out.println("--------------------");
            }
        }
    }

}
