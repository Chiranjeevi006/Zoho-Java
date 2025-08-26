/*Develop a Java program that illustrates the usage of the Comparator Interface */
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
class Person{
    int age;
    String name;
    int year;
    Person(int age,String name,int year){
        this.age=age;
        this.name=name;
        this.year=year;
    }
    public String toString(){
        return "\nName: "+name+" Age: "+age+" Year: "+year; 
    }
}
class Year implements Comparator<Person>{
    public int compare(Person i,Person j){
        return i.year-j.year;
    }
}
class AgeSort implements Comparator<Person>{
    public int compare(Person i,Person j){
        return i.age-j.age;
    }
}
class NameSort implements Comparator<Person>{
    public int compare(Person i,Person j){
        return i.name.compareToIgnoreCase(j.name);
    }
}

public class D8Two {
    public static void main(String[] args) {
        ArrayList<Person> list=new ArrayList<>();
        list.add(new Person(22,"Chiranjeevi",2003));
        list.add(new Person(20,"kalai",2005));
        list.add(new Person(20,"Chiranjeevi",2005));
        list.add(new Person(18,"Vijay",2007));
        list.add(new Person(21,"Perumal",2004));
        Collections.sort(list,new Year());
        System.out.println("\nSort by Year");
        System.out.println((list));
        Collections.sort(list,new AgeSort());
        System.out.println("\nSort by Age");
        System.out.println("\n"+(list));
        Collections.sort(list,new NameSort());
        System.out.println("\nSort by Name");
        System.out.println("\n"+(list));
    }
}
