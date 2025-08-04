import java.util.Scanner;;
class employee{
    String name;
    int employeeId;
    void employeedetails(Scanner scan){
        scan.nextLine();
        System.out.println("Enter the employee name: ");
        name=scan.nextLine();
        System.out.println("Enter the employee Id: ");
        employeeId=scan.nextInt();
    }
    double calculateSalary(){
        return 0;
    }
    void display(){
        System.out.println("\nEmployee Id: "+employeeId);
        System.out.println("Employee Name: "+name);
    }
}
class FullTimeEmployee extends employee{
    double salary;
    void employeedetails(Scanner sc){
        super.employeedetails(sc);
        System.out.println("Enter the salary: ");
        salary=sc.nextDouble();
    }
    double calculateSalary(){
        return salary;
    }
    void display(){
        super.display();
        System.out.println("The Salary of the employee is:"+calculateSalary());
    }
}
class PartTimeEmployee extends employee{
    double hoursWorked;
    double salaryPerHour;
    void employeedetails(Scanner sc){
        super.employeedetails(sc);
        System.out.println("Enter the employee worked hours: ");
        hoursWorked=sc.nextInt();
        System.out.println("Enter the salary per hour: ");
        salaryPerHour=sc.nextInt();
    }
    double calculateSalary(){
        return hoursWorked*salaryPerHour;
    }
    void display(){
        super.display();
        System.out.println("Salary per hour: "+salaryPerHour);
        System.out.println("Employee Total worked hours: "+ hoursWorked);
        System.out.println("Total salary of the employee is: "+calculateSalary());
    }
}
public class D5Three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Employee type:");
        System.out.println("1.Full time employee");
        System.out.println("2.Part time employee");
        int ch=sc.nextInt();
        switch(ch){
            case 1:
                 FullTimeEmployee e=new FullTimeEmployee();
                 e.employeedetails(sc);
                 e.display();
                 break;
            case 2:
                 PartTimeEmployee e1=new PartTimeEmployee();
                 e1.employeedetails(sc);
                 e1.display();
                 break;
            default:
                System.out.println("Invalid option");
        }
    }
}
