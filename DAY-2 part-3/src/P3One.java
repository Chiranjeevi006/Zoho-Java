import java.util.Scanner;
public class P3One {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the two Strings in Binary form:");
        String s1=scan.nextLine();
        String s2=scan.nextLine();
        int carry=0;
        int n1=s1.length()-1;
        int n2=s2.length()-1;
        String result="";
        while(n1>=0||n2>=0||carry!=0){
            int a = (n1 >= 0) ? s1.charAt(n1--) - '0' : 0;
            int b = (n2 >= 0) ? s2.charAt(n2--) - '0' : 0;
            result=(a+b+carry)%2+result;
            carry=(a+b)/2;
        }
        System.out.println(result);
   }
}
