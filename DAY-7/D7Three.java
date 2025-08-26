/*Create a Java application to manage employees in a company. Define an abstract class Employee with a method
calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary()
method based on their working type. Demonstrate runtime polymorphism by calling calculateSalary() on different types
of employees using the Employee reference */
abstract class Employee{
    String name;
    int empId;
    Employee(String name,int empId){
        this.name=name;
        this.empId=empId;
    }
    abstract void CalculateSalary();
}
class FullTimeEmployee extends Employee{
    int salary;
    FullTimeEmployee(String name,int empId,int salary){
        super(name,empId);
        this.salary=salary;
    }
    void CalculateSalary(){
        System.out.println("Salary of the Full time Employee is: "+salary);
    }
}
class PartTimeEmployee extends Employee{
    int salaryPerHour;
    int workedHours;
    PartTimeEmployee(String name,int empId,int salaryPerHour,int workedHours){
        super(name,empId);
        this.salaryPerHour=salaryPerHour;
        this.workedHours=workedHours;
    }
    void CalculateSalary(){
        System.out.println("Salary of the Part time Employee is: "+(salaryPerHour*workedHours));
    }
}
public class D7Three {
    public static void main(String[] args) {
        Employee e1=new PartTimeEmployee("Kumar", 4252, 57, 56);
        Employee e2=new FullTimeEmployee("Kumaran", 737, 55000);
        e1.CalculateSalary();
        e2.CalculateSalary();
    }
}
