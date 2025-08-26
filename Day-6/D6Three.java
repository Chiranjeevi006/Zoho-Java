/* Design a class`Employee with private data members: employee ID, name, designation, department, and monthly salary.
Use proper getter and setter methods to access and update these fields.
Add a method to calculate and return the annual salary of the employee.
‌ */
class Employe{
    private int employeeId;
    private String name;
    private String designation;
    private String department;
    private double salary;
    public void  setEmployeeId(int employeeId){
        this.employeeId=employeeId;
    }
    public void  setName(String name){
        this.name=name;
    }
    public void  setDesignation(String designation){
        this.designation=designation;
    }
    public void  setDepartment(String department){
        this.department=department;
    }
    public void  setSalary(double salary){
        this.salary=salary;
    }
    int getEmployeeId(){
        return this.employeeId;
    }
    String getName(){
        return this.name;
    }
    String getDesignation(){
        return this.designation;
    }
    String getDepartment(){
        return this.department;
    }
    double getSalary(){
        return salary;
    }
    void displayDetails(){
        System.out.println("-----The employee details-----");
        System.out.println("EmployeeId: "+getEmployeeId()+"\nName: "+getName()+"\nDesignation: "+getDesignation()+"\nDepartment: "+getDepartment()+"\nSalary: "+getSalary());
    }
    double calculateAnnualSalary(){
        return (this.salary)*12;
    }
}
public class D6Three {
    public static void main(String[] args) {
        //Scanner scan=new Scanner(System.in);
        Employe e1=new Employe();
        e1.setEmployeeId(2345);
        e1.setName("Gokul");
        e1.setDesignation("Supervisor");
        e1.setDepartment("Quality");
        e1.setSalary(55000);
        e1.displayDetails();
        System.out.println("The annual salary of the employee is: "+e1.calculateAnnualSalary());
    }
}
