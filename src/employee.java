public class employee {
    int empid;
    String name;
    String dept;
    double salary;
    employee(int empid,String name,String dept,double salary){
        this.empid=empid;
        this.name=name;
        this.dept=dept;
        this.salary=salary;
    }void display(){
        System.out.println("empid: "+empid+"\nname: "+name+"\ndept: "+dept+"\nsalary: "+salary);
    }

    public static void main(String[] args) {
        employee data=new employee(1095,"Gokul","Quality",25000);
        data.display();
    }

}
