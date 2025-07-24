import java.sql.SQLOutput;
import java.util.Scanner;
public class Four {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1=scan.nextInt();
        System.out.println("Enter num2;");
        int num2=scan.nextInt();
        int sum=num1-num2;
        if(sum==0){
            System.out.println("Both are Equal");
        }else{
            System.out.println("not equal");
        }
    }
}
