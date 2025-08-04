public class Employee{
    String name;
    int employeeId;
    String designation;
    double salary;

    Employee(){
        System.out.println("No argument constructor is created");
        name=null;
        employeeId=0;
        designation=null;
        salary=0.0;
    }
    Employee( String name,int employeeId,String designation,double salary){
        this.name=name;
        this.employeeId=employeeId;
        this.designation=designation;
        this.salary=salary;
    }
    Employee(Employee copy){
        this.name=copy.name;
        this.employeeId=copy.employeeId;
        this.designation=copy.designation;
        this.salary=copy.salary;
    }
    void display(){
        System.out.println("\nName:"+name+"\nEmployeeId:"+employeeId+"\nDesignation:"+designation+"\nSalary:"+salary);
        System.out.println();
    }
    public static void main(String[] args) {
        Employee E1=new Employee();
        Employee E2=new Employee("Kalai",917,"TATA",18000);
        Employee E3=new Employee(E2);
        System.out.println("Employee 1 details:");
        E1.display();
        System.out.println("Employee 2 details:");
        E2.display();
        System.out.println("Employee 3 details:");
        E3.display();
    }
}