import java.util.Scanner;
public class Six {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the decimal number:");
        int n= scan.nextInt();
        String bin="";
        while(n>0){
            bin=n%2+bin;
            n/=2;
        }
        if(bin.equals("")){
             bin="0";

        }
        System.out.print("The binary format of given Decimal value is:"+bin);

    }
}
