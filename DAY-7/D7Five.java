/* Develop a Java application for a Ticket Booking System that allows users to book tickets for different types of
transportation modes such as Bus, Train, and Flight.
 Define a common interface or abstract class Ticket with a method bookTicket() that each transportation mode
must implement differently.
 Create classes BusTicket, TrainTicket, and FlightTicket that extend the abstract class or implement the
interface.
 Demonstrate runtime polymorphism by calling the bookTicket() method using a reference of the base
class/interface. */
import java.util.Scanner;
interface TicketBooking{
    void details();
    void bookTicket();
}
class BusTicket implements TicketBooking{
    String name;
    int age;
    String gender;
    BusTicket(Scanner sc){
        System.out.println("Enter Name: ");
        this.name=sc.nextLine();
        System.out.println("Enter Gender: ");
        this.gender=sc.nextLine();
        System.out.println("Enter Age: ");
        this.age=sc.nextInt();
    }
    public void details(){
        System.out.println("Enter Name: "+name);
        System.out.println("Enter Gender: "+gender);
        System.out.println("Enter Age: "+age);
    }
    public void bookTicket(){
        System.out.println("Your Bus Ticket has Booked.......");
    }
}
class TrainTicket implements TicketBooking{
    String name;
    int age;
    String gender;
    TrainTicket(Scanner sc){
        System.out.println("Enter Name: ");
        this.name=sc.nextLine();
        System.out.println("Enter Gender: ");
        this.gender=sc.nextLine();
        System.out.println("Enter Age: ");
        this.age=sc.nextInt();
    }
    public void bookTicket(){
        System.out.println("Your Trian Ticket has Booked.......");
    }public void details(){
        System.out.println("Enter Name: "+name);
        System.out.println("Enter Gender: "+gender);
        System.out.println("Enter Age: "+age);
    }
}
class FlightTicket implements TicketBooking{
    String name;
    int age;
    String gender;
    FlightTicket(Scanner sc){
        System.out.println("Enter Name: ");
        this.name=sc.nextLine();
        System.out.println("Enter Gender: ");
        this.gender=sc.nextLine();
        System.out.println("Enter Age: ");
        this.age=sc.nextInt();
    }
    public void bookTicket(){
        System.out.println("Your Flight Ticket has Booked.......");
    }
    public void details(){
        System.out.println("Enter Name: "+name);
        System.out.println("Enter Gender: "+gender);
        System.out.println("Enter Age: "+age);
    }
}
public class D7Five {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("\n----Mode of transport----");
        System.out.println("\n1.Bus\n2.Train\n3.Flight");
        System.out.println("Enter your choice:");
        int a=scan.nextInt();
        scan.nextLine();
        switch (a) {
            case 1:
                System.out.println("----Welcome to Bus booking----");
                TicketBooking n1=new BusTicket(scan);
                n1.bookTicket();
                n1.details();
                break;
            case 2:
                System.out.println("----Welcome to Train booking----");
                TicketBooking n2=new TrainTicket(scan);
                n2.bookTicket();
                n2.details();
                break;
            case 3:
                 System.out.println("----Welcome to Flight booking----");
                 TicketBooking n3=new FlightTicket(scan);
                 n3.bookTicket();
                 n3.details();
                 break;
            default:
                System.out.println("Inavlid option......");
                break;
        }
    }
}