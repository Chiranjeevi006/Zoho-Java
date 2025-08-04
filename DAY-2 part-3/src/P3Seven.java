import java.util.Scanner;

public class P3Seven {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String 1:");
        String name=scan.nextLine();
        boolean space=false;
        int count=0;
        for(char c:name.toCharArray()){
            if(c!=' '){
                if(!space){
                    count++;
                    space=true;
                }
                
            }else{
                space=false;
            }
        }System.out.println(count);
    }
}
