/*Write a Java program to demonstrate the concept of object cloning using the clone() method.
--->Create a class Student with fields like name, rollNo, and department.
--->Attempt to clone an object of this class using the clone() method.
--->Catch and handle the CloneNotSupportedException if thrown.
***Also find out and explain why the class must implement the Cloneable interface to avoid
CloneNotSupportedException.
-->Your program should clearly illustrate:
a. What happens if Cloneable is not implemented
b. How the error is resolved by implementing Cloneable */
class Student implements Cloneable{
    String name;
    int rollNo;
    String dept;
    Student(int rollNo,String name,String dept){
        this.rollNo=rollNo;
        this.name=name;
        this.dept=dept;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public String toString(){
        return "Name of the Student: "+name+"\nRoll No: "+rollNo+"\nDepartment: "+dept;
    }
}
public class D8Eight {
    public static void main(String[] args) {
        Student s2=null;
        try{
            Student s1=new Student(1,"Chiranjeevi","ECE");
            s2=(Student) s1.clone();
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
            
        }
        System.out.println(s2);
    }
}
/*java.lang.CloneNotSupportedException: Student
        at java.base/java.lang.Object.clone(Native Method)
        at Student.clone(D8Eight.java:20)
        at D8Eight.main(D8Eight.java:31)
null */// this is the output without implementing Cloneable.