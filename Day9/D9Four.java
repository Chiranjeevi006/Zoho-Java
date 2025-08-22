/*Write a method to parse a string to an integer. Throw an exception if the string is not a valid number. Handle it using
try-catch */
import java.util.Scanner;
class main{
    static int intToString(String a) throws NumberFormatException{
        return (Integer.parseInt(a));
    }
}
public class D9Four {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String to Convert Integer: ");
        String s1=sc.nextLine();
        try{
            System.out.println("Number: "+main.intToString(s1));
        }
        catch(Exception e){
            System.out.println("Entered a invalid String..");
        }
    }
}
