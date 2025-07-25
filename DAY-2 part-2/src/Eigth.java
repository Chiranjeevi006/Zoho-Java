import java.util.Scanner;
public class Eigth {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter the age of Ten peoples:");
        int below18=0;
        int bet18_60=0;
        int above60=0;
        for(int i=0;i<10;i++){
            arr[i]=scan.nextInt();
            if(arr[i]<18){
                below18+=1;
            }else if(arr[i]>=18&&arr[i]<=60){
                bet18_60 +=1;
            }else{
                above60+=1;
            }
        }
        System.out.println("Below 18: "+below18);
        System.out.println("Betwwen 18-60 "+bet18_60);
        System.out.println("Above 60 "+above60);
    }
}
