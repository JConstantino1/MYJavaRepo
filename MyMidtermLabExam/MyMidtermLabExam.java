package midterm;
import java.util.Scanner;
import java.util.ArrayList;

public class MyMidtermLabExam {
    
// to access anywhere within the program    
    static Scanner scan = new Scanner(System.in);
    static ArrayList<String> tickets = new ArrayList<>();
    static ArrayList<String> urgencyLevel = new ArrayList<>();
    static ArrayList<String> statuses = new ArrayList<>();
    static int ticketLimit = 5;
        
    public static void main(String[] args) {
     
//     options for addings, updating,showing all tickets, and exiting   
        while(true){
            System.out.println("=== IT  Ticket System ===");
            System.out.println("1. Add Ticket");
            System.out.println("2. Update Ticket Status");
            System.out.println("3. Show All Ticket");
            System.out.println("4. Generate Report");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1:
                    addTicket();
                    break;
                case 2:
                    updateTicketStatus();
                    break;
                case 3:
                    showTickets();
                    break;
                case 4:
                    generateReport();
                    break;
                case 5:
                    System.out.println("Exiting, Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }    
    }
//method for adding tickets
    static void addTicket() {
        if (tickets.size() >= ticketLimit) {
            System.out.println("Cannot add more tickets. Ticket Limit reached.");
            return;
        }
//  inputs for issue description and urgency level
        System.out.print("Enter Issue Description: ");
        tickets.add(scan.nextLine().toLowerCase());
        System.out.print("Enter urgency level (Low/Medium/High): ");
        urgencyLevel.add(scan.nextLine().toLowerCase());
        statuses.add("pending");
        System.out.println("Ticket Successfully added!");
    }
     
//  Method for updating the ticket status
    static void updateTicketStatus() {
        if (tickets.size() <= 0){
            System.out.println("No tickets to update.");
            return;
        }
   
//        checking if the input number to update is valid 
       int index;
        while (true) {
            showTickets();
            System.out.print("Enter ticket number to update (1 to " + tickets.size() + "): ");
           if (!scan.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            scan.nextLine();
            continue;
           }
           
        index = scan.nextInt() - 1;
        scan.nextLine(); 
//        checking if the input number to update is valid and if it is already resolved
        if (index < 0 || index >= tickets.size()) {
            System.out.println("Invalid ticket number. Try again.");
        } else if (statuses.get(index).equals("resolved")) {
            System.out.println("Ticket " + (index + 1) + " is already resolved and cannot be updated. Choose another ticket.");
        } else {
            break;
            }
  
        }
//   getting input for the new update status and checking if it is a valid input
        System.out.println("Current Status: " + statuses.get(index));
        String statusUpdate;

        while (true) {
            System.out.print("Enter new status (in progress / resolved): ");
            statusUpdate = scan.nextLine().toLowerCase();

            if (statusUpdate.equals("in progress") || statusUpdate.equals("resolved")) {
                break;
        } else {
            System.out.println("Invalid status. Please enter 'in progress' or 'resolved'.");
            }
        }

        statuses.set(index, statusUpdate);
        System.out.println("Ticket status updated.");

    }     
   
//    method for showimg all the tickets 
    static void showTickets(){
        System.out.println("--- All Tickets ---");
        for (int i = 0; i < tickets.size(); i++) {
            System.out.println("[" + (i + 1) + "][" + urgencyLevel.get(i) + "] " + tickets.get(i) + " - Status: " + statuses.get(i));
        }
    }

    static void generateReport() {
        int pending = 0;
        int resolved = 0;

        for (int i = 0; i < tickets.size(); i++) {
            if (statuses.get(i).equals("Resolved")) {
                resolved++;
            } else {
                pending++;
            }
        }

        System.out.println(" --- Ticket Report --- ");
        System.out.println("Total Tickets: " + tickets.size());
        System.out.println("Pending/In Progress: " + pending);
        System.out.println("Resolved: " + resolved);
    }
}
