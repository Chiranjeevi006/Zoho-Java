/*Design a Java Ticket Booking System using polymorphism where Bus, Train, and Flight tickets share a common method but implement booking differently. */
import java.util.Scanner;
class TicketBookingSystem{
    String startLocation;
    String dropLocation;
    String name;
    int numpassengers;
    void enterDetails(Scanner sc){
        sc.nextLine();
        System.out.println("Enter the Journey start location: ");
        startLocation=sc.nextLine();
        System.out.println("Enter the Destination point: ");
        dropLocation=sc.nextLine();
        System.out.println("Enter your name: ");
        name=sc.nextLine();
        System.out.println("Enter the no of Passengers: ");
        numpassengers=sc.nextInt();
        sc.nextLine();
    }
    void bookTicket(){
        System.out.println("\nBooking ticket.....\n");
    }
    void  TicketConformation(){
         System.out.println("Enter 1.To Confirm Your booking\nOther to Cancel");
    }
}
class Bus extends TicketBookingSystem{
    String seatType;
    void enterDetails(Scanner sc){
        super.enterDetails(sc);
        //sc.nextLine();
        System.out.println("Enter the Seat type(Seater/Sleeper):");
        seatType=sc.nextLine();
    }
    void TicketConformation(){
        Scanner sc=new Scanner(System.in);
        super.TicketConformation();
        int a=sc.nextInt();
        if(a==1){
            sc.nextLine();
            bookTicket();
        }else{
            System.out.println("Your booking is cancelled");
        }
    }
    void bookTicket(){
        super.bookTicket();
        System.out.println(name+" your Bus ticket is booked \nFrom "+startLocation+" to "+dropLocation);
        System.out.println("Number of passengers: "+numpassengers);
        System.out.println("Seat Type: "+seatType);
    }
}
class Train extends TicketBookingSystem{
    String coachType;
    void enterDetails(Scanner sc){
        super.enterDetails(sc);
        System.out.println("Enter the coach type(1A / 2A / 3A / 3E / CC):");
        coachType=sc.nextLine();
    }void TicketConformation(){
        Scanner sc=new Scanner(System.in);
        super.TicketConformation();
        int a=sc.nextInt();
        if(a==1){
            sc.nextLine();
            this.bookTicket();
        }else{
            System.out.println("Your booking is cancelled");
        }
    }
    void bookTicket(){
        super.bookTicket();
        System.out.println(name+" your Train ticket is booked \nFrom "+startLocation+" to "+dropLocation);
        System.out.println("Number of passengers: "+numpassengers);
        System.out.println("Coach Type: "+coachType);
    }

}
class  Flight extends TicketBookingSystem{
    String travelClass;
    void enterDetails(Scanner sc){
        super.enterDetails(sc);
        System.out.println("Enter the Travel class(Economy/Business): ");
        travelClass=sc.nextLine();
    }void TicketConformation(){
        Scanner sc=new Scanner(System.in);
        super.TicketConformation();
        int a=sc.nextInt();
        if(a==1){
            sc.nextLine();
            this.bookTicket();
        }else{
            System.out.println("Your booking is cancelled");
        }
    }
    void bookTicket(){
        super.bookTicket();
        System.out.println(name+" your Flight ticket is booked \nFrom "+startLocation+" to "+dropLocation);
        System.out.println("Number of passengers: "+numpassengers);
        System.out.println("Travel class: "+travelClass);
    }

}
public class D5Four {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TicketBookingSystem Ticket=null;
        System.out.println("Mode of Transport:");
        System.out.println("1.BUS");
        System.out.println("2.Train");
        System.out.println("3.Flight");
        System.out.println("Enter your choice:");
        int a=sc.nextInt();
        switch (a) {
            case 1:
                Ticket=new Bus();
                break;
            case 2:
                Ticket=new Train(); 
                break;
            case 3:
                 Ticket=new Flight(); 
                 break;
            default:
                System.out.println("Ivalid respond");
                break;
        }
        Ticket.enterDetails(sc);
        Ticket.TicketConformation();
    }
}
