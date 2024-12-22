
package package_project;

import java.util.List;


public class Admin extends Agent {

    private String password;
    
    public Admin(String name, String email, int phone,int licensenumber) {
    super(); 
    setName(name);
    setEmail(email);
    setPhone(phone);
    setLicensenumber(licensenumber);
}
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    

    @Override
    public void input() {
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
       
        System.out.print("Enter password: ");
          String password = sc.next();
          
          this.password=password;
    }

    @Override
    public void display() {
        System.out.println("Name: "+super.getName());
        System.out.println("Email : "+super.getEmail());
        System.out.println("phone : "+super.getPhone()); 
         System.out.println("licensenumber: " + super.getLicensenumber());
        System.out.println("Admin Information:"+password);
    }

    public void addAdmin(java.util.List<Admin> admins) {
        input();
        admins.add(this);
        System.out.println("Admin added successfully.");
    }

    public void deleteAdmin(java.util.List<Admin> admins, String email) {
        boolean removed = admins.removeIf(admin -> admin.getEmail().equalsIgnoreCase(email));
        if (removed) {
            System.out.println("Admin deleted successfully.");
        } else {
            System.out.println("Admin not found.");
        }
    }

    public void updateAdmin(java.util.List<Admin> admins, String email) {
        for (Admin admin : admins) {
            if (admin.getEmail().equalsIgnoreCase(email)) {
                System.out.println("Updating admin details...");
                input();
                admin.setName(getName());
                admin.setEmail(getEmail());
                admin.setPhone(getPhone());
                admin.setLicensenumber(getLicensenumber());
                admin.setPassword(getPassword());
                System.out.println("Admin updated successfully.");
                return;
            }
        }
        System.out.println("Admin not found.");
    }

    public void selectAdmin(java.util.List<Admin> admins, String email) {
        for (Admin admin : admins) {
            if (admin.getEmail().equalsIgnoreCase(email)) {
                System.out.println("Admin found:");
                admin.display();
                return;
            }
        }
        System.out.println("Admin not found.");
    }

    public void viewAllAdmins(java.util.List<Admin> admins) {
        if (admins.isEmpty()) {
            System.out.println("No admins available.");
        } else {
            System.out.println("Listing all admins:");
            for (Admin admin : admins) {
                admin.display();
                System.out.println("--------------------");
            }
        }
    }

}
