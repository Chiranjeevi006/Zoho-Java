class hii{
    static void name(){
        System.out.println("Static method");
    }
    hii(){
        System.out.println("Constructor");
    }
    private void print(){
        System.out.println("Private Method");
    }
    final void method(){
        System.out.println("Final method");
    }
}
class hello extends hii{
    hello(){
        System.out.println("Hello constructor");
    }
    static void name(){
        System.out.println("Static method of hello");
    }
    void print(){
        System.out.println("print hello");
    }
    /*void method(){
        
        System.out.println("hello");
    }*/
}
public class D5Two {
    public static void main(String[] args) {
        hello n=new hello();//comstructor cant be ovverride
        n.print();//it is a new method not overriding private method
        //n.method();//can"t  override final method 
        n.name();//static method is hiding
       

        
    }
}
