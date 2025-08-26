/*Create a Java application to manage employees in a company. Define an Interface Employee with a method
calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary()
method based on their working type. Demonstrate runtime polymorphism by calling calculateSalary() on different types
of employees using the Employee reference*/
interface employee{
    void calculateSalary();
}
class fullTimeEmployee implements employee{
    int salary;
    String name;
    int empId;
    fullTimeEmployee(String name,int empId,int salary){
        this.salary=salary;
        this.name=name;
        this.empId=empId;
    }
    public void calculateSalary(){
        System.out.println("Salary of the Full time Employee is: "+salary);
    }
}
class partTimeEmployee implements employee{
    int salary;
    String name;
    int salaryPerHour;
    int workedHours;
    public partTimeEmployee(String name,int empId,int salaryPerHour,int workedHours){
       // this.salary=salary;
        this.name=name;
        this.salaryPerHour=salaryPerHour;
        this.workedHours=workedHours;
    }
    public void calculateSalary(){
        System.out.println("Salary of the Part time Employee is: "+(salaryPerHour*workedHours));
    }
}
public class D7Four {
    public static void main(String[] args) {
        employee e1=new partTimeEmployee("Kumar", 4252, 570, 56);
        employee e2=new fullTimeEmployee("Kumaran", 737, 55000);
        e1.calculateSalary();
        e2.calculateSalary();
    }
}
