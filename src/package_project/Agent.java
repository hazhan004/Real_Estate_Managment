
package package_project;

import java.util.ArrayList;
import java.util.List;


public class Agent extends person {

     private int licensenumber;
     
       public Agent() {
        
       super();
    }
     
      public Agent(String name,String email, int phone) {
        super.setName(name);
        super.setEmail(email);
        super.setPhone(phone);
       
    }
      
      public void setLicensenumber(int licensenumber) {
        this.licensenumber = licensenumber;
    }
      
      public int getLicensenumber() {
        return licensenumber;
    }

    @Override
    public void input() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        
        System.out.print("Enter Licensenumber: ");
          int licensenumber = sc.nextInt();
          
          this.licensenumber=licensenumber;
    }

    @Override
    public void display() {
        
        System.out.println("Name: "+super.getName());
        System.out.println("Email : "+super.getEmail());
        System.out.println("phone : "+super.getPhone()); 
          System.out.println("licensenumber: " + licensenumber);
    }

    
   public void addAgent(java.util.List<Agent> agents) {
        input();
        agents.add(this);
        System.out.println("Agent added successfully.");
    }

    public void deleteAgent(java.util.List<Agent> agents, String agentName) {
        boolean removed = agents.removeIf(agent -> agent.getName().equalsIgnoreCase(agentName));
        if (removed) {
            System.out.println("Agent deleted successfully.");
        } else {
            System.out.println("Agent not found.");
        }
    }

    public void updateAgent(java.util.List<Agent> agents, String agentName) {
        for (Agent agent : agents) {
            if (agent.getName().equalsIgnoreCase(agentName)) {
                System.out.println("Updating agent details...");
                input();
                agent.setName(this.getName());
                agent.setEmail(this.getEmail());
                agent.setPhone(this.getPhone());
                agent.setLicensenumber(this.getLicensenumber());
                System.out.println("Agent updated successfully.");
                return;
            }
        }
        System.out.println("Agent not found.");
    }

    public void selectAgent(java.util.List<Agent> agents, String agentName) {
        for (Agent agent : agents) {
            if (agent.getName().equalsIgnoreCase(agentName)) {
                System.out.println("Agent found:");
                agent.display();
                return;
            }
        }
        System.out.println("Agent not found.");
    }

    public void viewAllAgents(java.util.List<Agent> agents) {
        if (agents.isEmpty()) {
            System.out.println("No agents available.");
        } else {
            System.out.println("Listing all agents:");
            for (Agent agent : agents) {
                agent.display();
                System.out.println("--------------------");
            }
        }
    }
    


}
    

