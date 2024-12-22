
package package_project;

import java.util.List;


public class office extends RealEstate{

        private int floorarea;
        private int numberoffloorarea;
        private boolean parkingavailable;
        
 public office(int id,String location,double price) {
        super.setid(id);
        super.setlocation(location);
        super.setprice(price);
        
    }
       
        
   

        public int getFloorarea() {
        return floorarea;
    }

    public int getNumberoffloorarea() {
        return numberoffloorarea;
    }

    public boolean isParkingavailable() {
        return parkingavailable;
    }

   
    
     @Override
    public void input() {
       
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter  the floorarea: ");
        int floorarea = sc.nextInt();
        System.out.print("Enter  of numberoffloorarea: ");
        int numberoffloorarea = sc.nextInt();
        System.out.print("Enter  parkingavailable:(true,false) ");
        boolean parkingavailable= sc.hasNextBoolean();
        
        this.floorarea=floorarea;
        this.numberoffloorarea=numberoffloorarea;
        this.parkingavailable=parkingavailable;
    }

    @Override
    public void display() {
        System.out.println("ID : "+super.getid());
        System.out.println("location : "+super.getlocation());
        System.out.println("price : "+super.getprice());
        System.out.println("floorarea : " +floorarea );
        System.out.println("Number floors : " +numberoffloorarea );
        System.out.println("parking available : " +parkingavailable );
    }
     public void addOffice(java.util.List<office> offices) {
        input();
        offices.add(this);
        System.out.println("Office added successfully.");
    }

    public void deleteOffice(java.util.List<office> offices, int officeId) {
        boolean removed = offices.removeIf(office -> office.getid() == officeId);
        if (removed) {
            System.out.println("Office deleted successfully.");
        } else {
            System.out.println("Office not found.");
        }
    }

    public void updateOffice(java.util.List<office> offices, int officeId) {
        for (office office : offices) {
            if (office.getid() == officeId) {
                System.out.println("Updating office details...");
                input();
                office.setid(this.getid());
                office.setlocation(this.getlocation());
                office.setprice(this.getprice());
                office.floorarea = this.floorarea;
                office.numberoffloorarea = this.numberoffloorarea;
                office.parkingavailable = this.parkingavailable;
                System.out.println("Office updated successfully.");
                return;
            }
        }
        System.out.println("Office not found.");
    }

    public void selectOffice(java.util.List<office> offices, int officeId) {
        for (office office : offices) {
            if (office.getid() == officeId) {
                System.out.println("Office found:");
                office.display();
                return;
            }
        }
        System.out.println("Office not found.");
    }

    public void viewAllOffices(java.util.List<office> offices) {
        if (offices.isEmpty()) {
            System.out.println("No offices available.");
        } else {
            System.out.println("Listing all offices:");
            for (office office : offices) {
                office.display();
                System.out.println("--------------------");
            }
        }
    }

    
    }


