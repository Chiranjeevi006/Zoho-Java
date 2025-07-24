import java.util.Scanner;
public class Minimumof3 {
    public static void main(String[] args) {
        int n1=10;
        int n2=06;
        int n3=11;
        if(n1<=n2&&n1<=n3){

                System.out.println(n1);
            }
        else if(n1>=n2&&n2<=n3){
            System.out.println(n2);
        }else{
            System.out.println(n3);
        }
    }
}
