import java.util.Scanner;

public class P3Eight {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String 1:");
        String name=scan.nextLine();
        int n=name.length();
        int uppercount=0;
        for(char c:name.toCharArray()){
            if(Character.isUpperCase(c)){
                uppercount++;
            }
        }if(uppercount==n){
            System.out.println(true);
        }else if(uppercount==0){
            System.out.println(true);
        }else if((uppercount==1)&&(Character.isUpperCase(name.charAt(0)))){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    
}
