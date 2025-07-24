public class Three {
    public static void main(String[] args) {
        int arr[]=new int[30];
        int a=0;
        int b=1;
        for(int i=0;i<arr.length;i++){
            arr[i]=a;
            int c=a+b;
            a=b;
            b=c;
        }for(int i:arr){
            System.out.println(i);
        }
    }
}
