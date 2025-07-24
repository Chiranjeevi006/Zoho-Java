import java.util.*;
public class Nine {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int rollno[]=new int[10];
        int marks[][]=new int [10][3];
        double avg[]=new double[10];
        int total[]=new int[10];
        System.out.println("Enter the rollno of Ten Students:");
        for(int i=0;i<10;i++){
            rollno[i]=scan.nextInt();
        }System.out.println("Enter the marks of Ten Students:");
        for(int i=0;i<marks.length;i++){
            int sum=0;
            for(int j=0;j<marks[i].length;j++) {
                marks[i][j]=scan.nextInt();
                sum+=marks[i][j];

            }avg[i]=sum/3;
            total[i]=sum;
        }
        System.out.println("\nRollno\tTotal\tMarks");
        System.out.println("____________________________");
        for(int i=0;i<10;i++){
            System.out.printf("%d\t%d\t%.2f\n",rollno[i],total[i],avg[i]);
        }

    }
}
