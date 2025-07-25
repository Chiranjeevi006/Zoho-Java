import java.util.Scanner;
public class Seven {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=scan.nextInt();
        if((num>0)&&((num&(num-1))==0)){
            System.out.println("The number is power of 2");
        }else{
            System.out.println("The number is not power of 2");
        }
    }
}
