
package package_project;

import java.util.*;


public class Client extends person{

   

    
    private String role;
    
    public Client() {
        super();
    }
    
     public Client(String name,String email, int phone) {
        super.setName(name);
        super.setEmail(email);
        super.setPhone(phone);
    }
     
      public void setRole(String role) {
        this.role = role;
    }
      public String getRole() {
        return role;
    }

    @Override
    public void input() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        this.role=role;
        
    }

    @Override
    public void display() {
        System.out.println("Name: "+super.getName());
        System.out.println("Email : "+super.getEmail());
        System.out.println("phone : "+super.getPhone()); 
        
    }

    public void addClient(java.util.List<Client> clients) {
        input();
        clients.add(this);
        System.out.println("Client added successfully.");
    }

    public void deleteClient(java.util.List<Client> clients, String email) {
        boolean removed = clients.removeIf(client -> client.getEmail().equals(email));
        if (removed) {
            System.out.println("Client deleted successfully.");
        } else {
            System.out.println("Client not found.");
        }
    }

    public void updateClient(java.util.List<Client> clients, String email) {
        for (Client client : clients) {
            if (client.getEmail().equals(email)) {
                System.out.println("Updating client details...");
                input();
                client.setName(this.getName());
                client.setEmail(this.getEmail());
                client.setPhone(this.getPhone());
                client.setRole(this.getRole());
                System.out.println("Client updated successfully.");
                return;
            }
        }
        System.out.println("Client not found.");
    }

    public void selectClient(java.util.List<Client> clients, String email) {
        for (Client client : clients) {
            if (client.getEmail().equals(email)) {
                System.out.println("Client found:");
                client.display();
                return;
            }
        }
        System.out.println("Client not found.");
    }

    public void viewAllClients(java.util.List<Client> clients) {
        if (clients.isEmpty()) {
            System.out.println("No clients available.");
        } else {
            System.out.println("Listing all clients:");
            for (Client client : clients) {
                client.display();
                System.out.println("--------------------");
            }
        }
    }
    
    
}

    

