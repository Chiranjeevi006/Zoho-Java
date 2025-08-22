/*Write a Java program to accept a 4-digit ATM PIN from the user and validate whether it meets the following
conditions:
--->It must be exactly 4 digits long.
--->It should contain only numeric characters.
--->It must not start with 0.
Display an appropriate message whether the PIN is valid or invalid. */

import java.util.Scanner;
public class D9Six {
    public static void AtmPin(String pin){
        try{
            if(!(pin.length()==4)){
                throw new Exception("Invalid pin size");
            }
            if(pin.startsWith("0")){
                throw new Exception("Invalid start of pin");
            }
            int a=Integer.parseInt(pin);
            System.out.println("Valid Pin");
        }
        catch(NumberFormatException e){
            System.out.println("Invalid it should contain only Numbers");
        }
        catch(Exception e1){
            System.out.println(e1.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String pin;
        System.out.println("Enter the Atm pin:");
        pin=sc.nextLine();
        AtmPin(pin);
        sc.close();

    }
}

