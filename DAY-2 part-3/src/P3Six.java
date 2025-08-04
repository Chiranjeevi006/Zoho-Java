import java.util.Scanner;
public class P3Six {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String 1:");
        String num1=scan.nextLine();
        System.out.println("Enter the String 2:");
        String num2=scan.nextLine();
        String sum="";
        int carry=0;
        int n=num1.length()-1;
        int m=num2.length()-1;
        while(n>=0||m>=0||carry!=0){
            int a=(n>=0)?(num1.charAt(n)-'0'):0;
            int b=(m>=0)?(num2.charAt(m)-'0'):0;
            sum=((a+b+carry)%10)+sum;
            carry=(a+b+carry)/10;
            n--;
            m--;
        }System.out.println("The sum of two integers is "+sum);
    }
}
