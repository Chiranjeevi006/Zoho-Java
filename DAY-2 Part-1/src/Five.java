import java.util.Scanner;
public class Five {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the n:");
        int n=scan.nextInt();
        int i=1;
        int count=0;
        while(i<=n){
            if(i%2!=0){
                i++;
                continue;
            }count+=i;
            i++;
        }
        System.out.println(count);
    }
}
