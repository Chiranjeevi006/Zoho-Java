import java.util.Scanner;
class BasicCalculator {
    int add(int a, int b){
        return a+b;
    }
    int subtract(int a, int b){
        return (a-b);
    }
    int multiply(int a, int b){
        return (a*b);
    }
    int divide(int a, int b){
        if(b==0){
            throw new ArithmeticException();
        }
        return (a/b);
    }
}
class AdvancedCalculator extends BasicCalculator{
    int power(int base, int exponent){
        int result=1;
       for (int i=1;i<=exponent;i++){
          result *=base;
       }return result;
    }
    int modulus(int a, int b){
        return (a%b);
    }
    double squareRoot(double number){
        return Math.sqrt(number);
    }
}
class ScientificCalculator extends AdvancedCalculator{
    double sin(double angle){
        return Math.sin(Math.toRadians(angle));
    }
    double cos(double angle){
        return Math.cos(Math.toRadians(angle));
    }
    double log(double value){
        return Math.log(value);
    }
    double exp(double value){
        return Math.exp(value);
    }
}
public class D4Seven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ScientificCalculator calc=new ScientificCalculator();
        int choice;
        
        do {
            System.out.println("\nCalculator Menu ");
            System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");
            System.out.println("5. Power\n6. Modulus\n7. Square Root");
            System.out.println("8. Sine (degrees)\n9. Cosine (degrees)");
            System.out.println("10. Log (natural)\n11. Exponential");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            int a, b;
            double x;

            switch (choice) {
                case 1:
                    System.out.print("Enter two integers: ");
                    a = sc.nextInt(); b = sc.nextInt();
                    System.out.println("Addition: " + calc.add(a, b));
                    break;
                case 2:
                    System.out.print("Enter two integers: ");
                    a = sc.nextInt(); b = sc.nextInt();
                    System.out.println("Subtraction: " + calc.subtract(a, b));
                    break;
                case 3:
                    System.out.print("Enter two integers: ");
                    a = sc.nextInt(); b = sc.nextInt();
                    System.out.println("Multiplication: " + calc.multiply(a, b));
                    break;
                case 4:
                    System.out.print("Enter two integers: ");
                    a = sc.nextInt(); b = sc.nextInt();
                    System.out.println("Division: " + calc.divide(a, b));
                    break;
                case 5:
                    System.out.print("Enter base and exponent: ");
                    a = sc.nextInt(); b = sc.nextInt();
                    System.out.println("Power: " + calc.power(a, b));
                    break;
                case 6:
                    System.out.print("Enter two integers: ");
                    a = sc.nextInt(); b = sc.nextInt();
                    System.out.println("Modulus: " + calc.modulus(a, b));
                    break;
                case 7:
                    System.out.print("Enter a number: ");
                    x = sc.nextDouble();
                    System.out.println("Square Root: " + calc.squareRoot(x));
                    break;
                case 8:
                    System.out.print("Enter angle in degrees: ");
                    x = sc.nextDouble();
                    System.out.println("Sine: " + calc.sin(x));
                    break;
                case 9:
                    System.out.print("Enter angle in degrees: ");
                    x = sc.nextDouble();
                    System.out.println("Cosine: " + calc.cos(x));
                    break;
                case 10:
                    System.out.print("Enter a positive number: ");
                    x = sc.nextDouble();
                    System.out.println("Natural Log: " + calc.log(x));
                    break;
                case 11:
                    System.out.print("Enter exponent value: ");
                    x = sc.nextDouble();
                    System.out.println("Exponential: " + calc.exp(x));
                    break;
                case 0:
                    System.out.println("Exiting Calculator");
                    break;
                default:
                    System.out.println("Invalid choice,Try again.");
                    continue;
            }
        } while (choice != 0);
    }
    
}
