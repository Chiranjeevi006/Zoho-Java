/*Create a Java application that demonstrates the use of user-defined packages by organising classes based on their functionality:
--- arithmetic: This package should include a class that defines methods to perform the following operations on two numbers:
a. Addition
b. Subtraction
c. Multiplication
d. Division
e. Modulo
--- stringutils: This package should include a class that defines methods for:
a. Concatenating two strings
b. Reversing a string
c. Finding the length of a string
In your main class (outside those packages), import the above packages and demonstrate the usage of all the methods. */
import MyCalculator.Arithmetic.Operations;
import MyCalculator.stringutils.StringFunctions;
public class D6Two {
    public static void main(String[] args) {
        Operations m=new Operations();
        int a=20;
        int b=5;
        System.out.println("----Arithmetic Operations----");
        System.out.println("Addition: "+m.add(a, b));
        System.out.println("Subtraction: "+m.sub(a, b));
        System.out.println("Multiplication: "+m.Multiplication(a, b));
        System.out.println("Division: "+m.Division(a, b));
        System.out.println("----String  Operations----");
        String c="Hello";
        StringFunctions s=new StringFunctions(c);
        System.out.println("Concatenating: "+s.Concatenating(" Chiru"));
        System.out.println("REverse: "+s.reverse());
        System.out.println("Length of the String: "+s.Length());
  }
}
