/* Develop a Java program that illustrates the usage of the Comparator Interface. */
import java.util.ArrayList;
import java.util.Collections;
class Hii implements Comparable<Hii> {
    int age;
    String name;
    Hii(int age,String name){
        this.name=name;
        this.age=age;
    }
    public int compareTo(Hii i){
        if(this.age>i.age){
            return 1;
        }
        else if(this.age<i.age){
            return -1;
        }
        else{
            return 0;
        }
    }
    public String toString(){
        return "\nAge: "+age+" Name: "+name;
    }
}
public class D8Three {
    public static void main(String[] args) {
         Hii n1=new Hii(12,"Sathish");
         Hii n2=new Hii(15, "Kumar");
         Hii n3=new Hii(20,"Kalai");
         Hii n4=new Hii(21,"Chiranjeevi");
         ArrayList<Hii> list=new ArrayList<>();
         list.add(n1);
         list.add(n2);
         list.add(n3);
         list.add(n4);
         Collections.sort(list);
         System.out.println(list);
    }
}
