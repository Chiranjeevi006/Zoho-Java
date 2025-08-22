/*Write a Java program that shows exception propagation across multiple methods (method1 calls method2 calls
method3, which throws the exception). Handle the exception in method1. */
class Propagation{
    static void method1(){
        try{
            method2();
        }
        catch(ArithmeticException e){
            System.out.println("Can't Divide by Zero");
        }
        System.out.println("Method 1");
    }
    static void method2(){
        method3();
        System.out.println("Method 2");
    }
    static void method3(){
        int c=10/0;
        System.out.println("Method 3");
    }
}
public class D9Seven {
    public static void main(String[] args) {
        Propagation.method1();
    }
}
