/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package_project;

import java.util.*;

 public class RealEstate {

     
     private int id;
    private String location;
    private double price;
    
    public void setid(int id) {
        this.id = id;
    }

    public void setlocation(String location) {
        this.location = location;
    }

    public void setprice(double price) {
        this.price = price;
    }

    public int getid() {
        return id;
    }

    public String getlocation() {
        return location;
    }

    public double getprice() {
        return price;
    }

    
    
    
   
    
    
     public void input() {
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
         
         
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();  
        System.out.print("Enter Location: ");
         String location = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        this.id=id;
        this.location=location;
        this.price=price;
        
        
     }
     
   public void display() {
        System.out.println("Real Estate Details:");
        System.out.println("ID: " + id);
        System.out.println("Location: " + location);
        System.out.println("Price: " + price);
    }

    public void addProperty(java.util.List<RealEstate> properties) {
        input();
        properties.add(this);
        System.out.println("Property added successfully.");
    }

    public void deleteProperty(java.util.List<RealEstate> properties, int propertyId) {
        boolean removed = properties.removeIf(property -> property.getid() == propertyId);
        if (removed) {
            System.out.println("Property deleted successfully.");
        } else {
            System.out.println("Property not found.");
        }
    }

    public void updateProperty(java.util.List<RealEstate> properties, int propertyId) {
        for (RealEstate property : properties) {
            if (property.getid() == propertyId) {
                System.out.println("Updating property details...");
                input();
                property.setid(this.id);
                property.setlocation(this.location);
                property.setprice(this.price);
                System.out.println("Property updated successfully.");
                return;
            }
        }
        System.out.println("Property not found.");
    }

    public void selectProperty(java.util.List<RealEstate> properties, int propertyId) {
        for (RealEstate property : properties) {
            if (property.getid() == propertyId) {
                System.out.println("Property found:");
                property.display();
                return;
            }
        }
        System.out.println("Property not found.");
    }

    public void viewAllProperties(java.util.List<RealEstate> properties) {
        if (properties.isEmpty()) {
            System.out.println("No properties available.");
        } else {
            System.out.println("Listing all properties:");
            for (RealEstate property : properties) {
                property.display();
                System.out.println("--------------------");
            }
        }
    }
     
}

