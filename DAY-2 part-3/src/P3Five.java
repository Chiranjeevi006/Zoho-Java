import java.util.Scanner;
public class P3Five {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String 1:");
        String name1=scan.nextLine();
        System.out.println("Enter the String 2:");
        String name2=scan.nextLine();
        int j=0;
        int count=0;
        for(int i=0;i<name2.length();i++){
            if(j<name1.length()){
                if(name2.charAt(i)==name1.charAt(j)){
                    count++;
                    j++;
                }
                
            }
            
        }if(count==name1.length()){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
