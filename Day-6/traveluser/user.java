/*Design a travel booking system using two packages:`travel.booking – includes a class`Ticket with ticket ID, destination, and fare.
`travel.user – includes a class`User with user details and a method to book a ticket.
Illustrate accessing ticket data from within the user class. */
package traveluser;
import java.util.Scanner;
import travelBooking.Ticket;
public class user {
    private String name;
    private String gender;
    private int age;
    public user(Scanner sc){
        System.out.println("ENter the name: ");
        name=sc.nextLine();
        System.out.println("Enter gender: ");
        gender=sc.nextLine();
        System.out.println("Enter the Age: ");
        age=sc.nextInt();
        this.name=name;
        this.gender=gender;
        this.age=age;
    }
    public void bookTicket(Scanner sc){
        Ticket t=new Ticket(sc);
        System.out.println("Your Ticket has Booked");
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        t.displayTicketDetails();
    }
}
