import java.util.Scanner;
public class Ten {
    static void input(int arr[][],int row,int column){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    static void display(int arr[][],int row,int column){
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
               System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
    }
    static void sumofall(int arr[][],int row,int column){
        int sum=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
              sum+= arr[i][j];
            }
        }System.out.println("The sum of the array is "+sum);
    }
    static void sumofrow(int arr[][],int row,int column){
        for(int i=0;i<row;i++){
            int sum=0;
            for(int j=0;j<column;j++){
              sum+= arr[i][j];
            }System.out.println("The sum of row "+(i+1)+"is "+sum);
        }
    }
    static void sumofcol(int arr[][],int row,int column){
        for(int i=0;i<column;i++){
            int sum=0;
            for(int j=0;j<row;j++){
              sum+= arr[j][i];
            }System.out.println("The sum of col "+(i+1)+"is "+sum);
        }
    }
    static void transpose(int arr[][],int row,int column){
        for(int i=0;i<column;i++){
            for(int j=0;j<row;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
    }

    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        int row=scan.nextInt();
        System.out.println("Enter the no of Columns:");
        int column=scan.nextInt();
        int arr[][]=new int[row][column];
        int ch;
        do{
            System.out.println("Menu");
            System.out.println("1.Input the Array");
            System.out.println("2.Display the array");
            System.out.println("3.To get the sum of Array");
            System.out.println("4.To get the sum of rowise");
            System.out.println("5.To get the sum of column");
            System.out.println("6.To get the sum of Transpose of Array");
            System.out.println("7.Exist from menu");
            ch=scan.nextInt();
            switch(ch){
                case 1:
                Ten.input(arr,row,column);
                break;
                case 2:
                Ten.display(arr,row,column);
                break;
                case 3:
                Ten.sumofall(arr,row,column);
                break;
                case 4:
                Ten.sumofrow(arr,row,column);
                break;
                case 5:
                Ten.sumofcol(arr,row,column);
                break;
                case 6:
                Ten.transpose(arr,row,column);
                break;
                case 7:
                System.out.println("Exisiting from the menu");
                break;
                default:
                System.out.println("Invalid option");
            }
    }while(ch!=7);
    scan.close();
}
}
