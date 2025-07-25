import java.util.Scanner;
public class Two {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num[] = new int[10];
        int count = 0;
        System.out.println("Enter the numbers:");
        for (int i = 0; i < num.length; i++) {
            num[i] = scan.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            int c = 0;
            if (num[i] > 1) {

                for (int j = 2; j <= num[i]/2; j++) {
                    if (num[i] % j == 0) {
                        c++;
                    }
                }
                if (c==0) {
                    count += num[i];

                }
            }


        }System.out.println("The sum of Prime number in the given is:" + count);
    }
}