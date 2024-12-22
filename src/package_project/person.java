
package package_project;

import java.util.List;
import java.util.Scanner;


 public class person {
    
    private String name;
     private String email;
     private int phone;
     
     public person(){
     super();
     }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

     
     
    
    
    

    public String getName() {
        return name;
    }

     public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }

    

     public void input() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
         System.out.println("Enter you information");
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        System.out.print("Enter phone: ");
       int phone = sc.nextInt();
       
        this.name = name;
        this.email = email;
        this.phone=phone;
    }

    public void display() {
        
       
    }
    public void addPerson(java.util.List<person> people) {
        input();
        people.add(this);
        System.out.println("Person added successfully.");
    }

    public void deletePerson(java.util.List<person> people, String personName) {
        boolean removed = people.removeIf(person -> person.getName().equalsIgnoreCase(personName));
        if (removed) {
            System.out.println("Person deleted successfully.");
        } else {
            System.out.println("Person not found.");
        }
    }

    public void updatePerson(java.util.List<person> people, String personName) {
        for (person person : people) {
            if (person.getName().equalsIgnoreCase(personName)) {
                System.out.println("Updating person details...");
                input();
                person.setName(this.name);
                person.setEmail(this.email);
                person.setPhone(this.phone);
                System.out.println("Person updated successfully.");
                return;
            }
        }
        System.out.println("Person not found.");
    }

    public void selectPerson(java.util.List<person> people, String personName) {
        for (person person : people) {
            if (person.getName().equalsIgnoreCase(personName)) {
                System.out.println("Person found:");
                person.display();
                return;
            }
        }
        System.out.println("Person not found.");
    }

    public void viewAllPeople(java.util.List<person> people) {
        if (people.isEmpty()) {
            System.out.println("No people available.");
        } else {
            System.out.println("Listing all people:");
            for (person person : people) {
                person.display();
                System.out.println("--------------------");
            }
        }
    }
     
   

}

 
