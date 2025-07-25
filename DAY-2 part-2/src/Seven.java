import java.util.Scanner;
public class Seven {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter the weight of Ten peoples:");
        for(int i=0;i<10;i++){
            arr[i]=scan.nextInt();
        }for(int i=0;i<arr.length-1;i++){
            int index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[index]<arr[j]){
                   index=j;
                }
            }if(index!=i){
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }
        }for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
