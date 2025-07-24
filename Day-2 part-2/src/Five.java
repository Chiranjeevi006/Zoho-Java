import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the Arrays:");
        int n=scan.nextInt();
        char[] c1=new char[n];
        char [] c2=new char[n];
        boolean ans=true;
        System.out.println("Enter the charcters in the Array1:");
        for(int i=0;i<n;i++){
            c1[i]=scan.next().charAt(0);
        }System.out.println("Enter the charcters in the Array1:");
        for(int i=0;i<n;i++){
            c2[i]=scan.next().charAt(0);
        }for(int i=0;i<n;i++){
            if(c1[i]!=c1[i]){
                ans=false;
            }
        }if(ans){
            System.out.println("Both are identical");
        }else{
            System.out.println("Both are not identical");
        }
    }

}
