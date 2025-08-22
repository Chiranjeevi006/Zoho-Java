/*Create a program where the try block contains a return statement. Ensure that the finally block executes before the
method returns. Show this with output.*/
class A{
    static int division(){
        try{
            System.out.println("Try block");
            return 100;
        }
        catch(Exception e){
            System.out.println("Catch block");
            return -1;
        }
        finally{
            System.out.println("Finally block Executed");
        }
    }
}
public class D9Five {
    public static void main(String[] args) {
        System.out.println(A.division());
    }
}
