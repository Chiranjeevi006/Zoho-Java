import java.util.Scanner;
public class Eight {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=scan.nextInt();
        int position=1;
        while((num&1)==0){
            num>>=1;
            position ++;
        }
        System.out.println("First set bit of the number is "+position);
    }
}
