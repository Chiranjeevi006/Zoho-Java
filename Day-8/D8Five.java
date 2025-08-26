/* Write a program to illustrate the usage of clone() and find out what kind of copy it will make. */
class Name{
    String name;
    Name(String name){
        this.name=name;
    }
    public String toString(){
        return name;
    }
}
class Hiii implements Cloneable{
    int a,b;
    Name n;
    Hiii(int a,int b,Name n){
        this.n=n;
        this.a=a;
        this.b=b;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public String toString(){
        return "Name: "+n+" a: "+a+" b: "+b;
    }
}
public class D8Five {
    public static void main(String[] args) throws CloneNotSupportedException{
        Name n1=new Name("Jeni");
        Hiii o1=new Hiii(1,7,n1);
        Hiii o2=(Hiii) o1.clone();
        o1.n.name="Heloo";
        System.out.println(o1);
        System.out.println(o2);
    }
    
}
