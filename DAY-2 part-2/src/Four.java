import java.util.Scanner;
public class Four {
    void print(int arr[],int n){
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]>1&&arr[i]<=99){
                sum+=arr[i];
            }
        }
        System.out.println("The sum of one digit and two digit number in the a given array is: "+sum);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n=scan.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the numbers in the array:");
        for(int i=0;i<n;i++){
            nums[i]=scan.nextInt();
        }
        Four ans=new Four();
        ans.print(nums,n);
    }
}
