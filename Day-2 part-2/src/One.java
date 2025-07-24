import java.util.Scanner;
public class One {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num[]=new int[10];
        int count=0;
        System.out.println("Enter the numbers:");
        for(int i=0;i<10;i++){
            num[i]=scan.nextInt();
            if(num[i]%2!=0){
                count+=num[i];
            }
        }
        System.out.println("The sum of Odd number in the given is:"+count);
    }
}
