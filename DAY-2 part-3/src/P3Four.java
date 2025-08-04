import java.util.Scanner;
public class P3Four {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String 1:");
        String name1=scan.nextLine();
        System.out.println("Enter the String 2:");
        String name2=scan.nextLine();
        
        for(int i=0;i<name2.length();i++){
            char result=name2.charAt(i);
            if(name1.indexOf(result)==-1){
                System.out.println(result);
                break;
            }
        }
        
    }
}
