class Employees{
    String name;
    int yearOfJoin;
    String address;
    Employees(String name,int yearOfJoin,String address){
        this.name=name;
        this.yearOfJoin=yearOfJoin;
        this.address=address;
    }
    void printDetails(){
        System.out.printf("%-10s%-15d%-20s\n",name,yearOfJoin,address);
    }
}
public class D3Six {
    public static void main(String[] args) {
        Employees E1=new Employees("Robert",1994,"64C- WallsStreat");
        Employees E2=new Employees("Sam",2000,"68D- WallsStreat");
        Employees E3=new Employees("John",1999,"26B- WallsStreat");
        System.out.printf("%-10s%-15s%-20s\n","Name","YearOfJoin","Address");
        E1.printDetails();
        E2.printDetails();
        E3.printDetails();
    }
}