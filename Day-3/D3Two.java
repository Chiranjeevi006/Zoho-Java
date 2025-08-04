class Student{
    String name;
    int roll_no;
    int phone_no;
    String address;
    Student(String name,int roll_no,int phone_no,String address){
        this.name=name;
        this.roll_no=roll_no;
        this.phone_no=phone_no;
        this.address=address;
    }
    void display(){
        System.out.println("Name:"+name+"\nroll_no:"+roll_no+"\nphone_no"+phone_no+"\naddress:"+address);
    }
}
public class D3Two {
    public static void main(String[] args) {
        Student s1=new Student("John",01,657689,"ABC");
        Student s2=new Student("Sam",75,86958,"FHJG");
        s1.display();
        s2.display();
    }
}
