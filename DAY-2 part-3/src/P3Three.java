import java.util.Arrays;
import java.util.Scanner;
public class P3Three {
    static boolean isVowel(char c){
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String:");
        String name=scan.nextLine();
        char[] nam=name.toCharArray();
        int left=0;
        int right=nam.length-1;
        while(left<right){
            char temp=0;
            while((left<right)&&!isVowel(nam[left])){
                left++;
            }
            while((left<right)&&!isVowel(nam[right])){
                right--;
            }temp=nam[left];
            nam[left]=nam[right];
            nam[right]=temp;
            left++;
            right--;
        }System.out.println(new String(nam));
      
    }
    
}
