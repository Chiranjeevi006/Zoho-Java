class A{
    void name(){
        System.out.println("A-Class");
    }
}
class B{
    void  name(){
        System.out.println("B-class");
    }
}
/*Write a program to illustrate that 
Classes cannot be used for multiple Inheritance. */
public class D4Four extends A,B {
    public static void main(String[] args) {
        D4Four n=new D4Four();
        n.name();
    }
}
