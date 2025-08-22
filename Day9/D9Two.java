/*Demonstrate multiple catch blocks: accept two numbers as strings, then convert them to integers, and perform
division, and catch the following exceptions: InputMismatchException, NumberFormatException, ArithmeticException
and Exception. */
import java.util.InputMismatchException;
import java.util.Scanner;
public class D9Two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two String:");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        try{
            int a=Integer.parseInt(s1);
            int b=Integer.parseInt(s2);
            int c=a/b;
            System.out.println("Division of a and b is: "+c);
        }
        catch(InputMismatchException e1){
            e1.printStackTrace();
        }
        catch(NumberFormatException e2){
            e2.printStackTrace();
        }
        catch(ArithmeticException e3){
            e3.printStackTrace();
        }
        catch(Exception e4){
            e4.printStackTrace();
        }System.out.println("Try catch Executed");
        sc.close();
    }
}