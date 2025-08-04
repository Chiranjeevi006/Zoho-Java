import java.util.Scanner;
public class P3Two {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=scan.nextInt();
        String result="";
        while(num>0){
            num--;
            int remainder=num%26;
            char res=(char)('A'+remainder);
            result=res + result;
            num/=26;

        }System.out.println(result);
    }
    
}
