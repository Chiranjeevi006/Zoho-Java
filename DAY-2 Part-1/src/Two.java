import java.util.Scanner;
public class Two {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j||j==n-i-1){
                    System.out.print(1);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
