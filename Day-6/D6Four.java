/*Design a travel booking system using two packages:`travel.booking – includes a class`Ticket with ticket ID, destination, and fare.
`travel.user – includes a class`User with user details and a method to book a ticket.
Illustrate accessing ticket data from within the user class. */
import java.util.Scanner;
import travelBooking.Ticket;
import traveluser.user;
public class D6Four {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        user b=new user(sc);
        b.bookTicket(sc);
    }
}
