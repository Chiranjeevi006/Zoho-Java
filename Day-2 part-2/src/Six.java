import java.util.Scanner;
public class Six {
    public static void main(String[] args) {
        int arr[]={1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2022};
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Graduation year:");
        boolean ans=false;
        int year=scan.nextInt();
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==year){
                ans=true;
                break;
            }else if(arr[mid]>year){
                end=mid-1;
            }else if(arr[mid]<year){
                start=mid+1;
            }

        }if(ans){
            System.out.println("Records exists");
        }else{
            System.out.println("Records doesn't exists");
        }
    }
}
