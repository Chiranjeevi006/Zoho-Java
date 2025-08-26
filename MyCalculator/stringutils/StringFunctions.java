/* stringutils: This package should include a class that defines methods for:
a. Concatenating two strings
b. Reversing a string
c. Finding the length of a string
In your main class (outside those packages), import the above packages and demonstrate the usage of all the methods. */
package MyCalculator.stringutils;

public class StringFunctions{
    String a;
    public StringFunctions(String a){
        this.a=a;
    }
    public String Concatenating(String b){
        return a+b;
    }
    public String reverse(){
        String c="";
        for(char d:a.toCharArray()){
            c=d+c;
        }return c;
    }
    public int Length(){
        char[] arr=a.toCharArray();
        int i=arr.length;
        return i;
    }
}
