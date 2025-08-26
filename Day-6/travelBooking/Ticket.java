/*Design a travel booking system using two packages:`travel.booking – includes a class`Ticket with ticket ID, destination, and fare.
`travel.user – includes a class`User with user details and a method to book a ticket.
Illustrate accessing ticket data from within the user class. */
package travelBooking;
import java.util.Scanner;;
public class Ticket {
    int ticketId;
    String destination;
    double fare;
    public Ticket(Scanner sc){
        System.out.println("Enter the Ticket Id: ");
        ticketId=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the destination: ");
        destination=sc.nextLine();
        System.out.println("Enter the fare: ");
        fare=sc.nextDouble();
        this.ticketId=ticketId;
        this.destination=destination;
        this.fare=fare;
    }
    int getTicketId(){
        return this.ticketId;
    }
    String getDestination(){
        return this.destination;
    }
    double getFare(){
        return this.fare;
    }
    public void displayTicketDetails(){
        System.out.println("----Ticket Details----");
        System.out.println("TicketId: "+getTicketId());
        System.out.println("Destination: "+getDestination());
        System.out.println("Fare: "+getFare());
    }

}
