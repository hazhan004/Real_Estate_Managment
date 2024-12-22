
package package_project;

import java.util.List;


public class land extends RealEstate{

    
    private double area;
    private String zoningtype;

    
    public land(int id,String location,double price) {
        super.setid(id);
        super.setlocation(location);
        super.setprice(price);
        
    }
   
    
    public double getArea() {
        return area;
    }

    public String getZoningtype() {
        return zoningtype;
    }

    @Override
    public void input() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter Area (in square feet): ");
        double area = sc.nextDouble();
        System.out.println("Enter the Zoningtype:");
        String zoningtype=sc.next();
        this.area=area;
        this.zoningtype=zoningtype;
        
        
    }

    @Override
    public void display() {
        
        System.out.println("ID : "+super.getid());
        System.out.println("location : "+super.getlocation());
        System.out.println("price : "+super.getprice());
        System.out.println("Land Area: " + area + " sq ft");
        System.out.println("Zoningtype:"+zoningtype);
    }
    
    public void addLand(java.util.List<land> lands) {
        input();
        lands.add(this);
        System.out.println("Land added successfully.");
    }

    public void deleteLand(java.util.List<land> lands, int landId) {
        boolean removed = lands.removeIf(land -> land.getid() == landId);
        if (removed) {
            System.out.println("Land deleted successfully.");
        } else {
            System.out.println("Land not found.");
        }
    }

    public void updateLand(java.util.List<land> lands, int landId) {
        for (land l : lands) {
            if (l.getid() == landId) {
                System.out.println("Updating land details...");
                input();
                l.setid(super.getid());
                l.setlocation(super.getlocation());
                l.setprice(super.getprice());
                l.area = this.area;
                l.zoningtype = this.zoningtype;
                System.out.println("Land updated successfully.");
                return;
            }
        }
        System.out.println("Land not found.");
    }

    public void selectLand(java.util.List<land> lands, int landId) {
        for (land l : lands) {
            if (l.getid() == landId) {
                System.out.println("Land found:");
                l.display();
                return;
            }
        }
        System.out.println("Land not found.");
    }

    public void viewAllLands(java.util.List<land> lands) {
        if (lands.isEmpty()) {
            System.out.println("No lands available.");
        } else {
            System.out.println("Listing all lands:");
            for (land l : lands) {
                l.display();
                System.out.println("--------------------");
            }
        }
    }

    
}
