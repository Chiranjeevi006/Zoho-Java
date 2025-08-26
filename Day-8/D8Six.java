/*Develop a Java program to illustrate pass-by-value*/
class pass{
    static int add(int a,int b){
        return a+b;
    }
}
public class D8Six {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Before passing by Value");
        System.out.println("a: "+a+" b: "+b);
        int sum=pass.add(a,b);
        System.out.println("After Pass: ");
        System.out.println("a: "+a+" b: "+b);
        System.out.println("Sum: "+sum);
    }
}
