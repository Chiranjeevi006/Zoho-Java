class MyString{
    private char data[];
    MyString(char[] ip){
        data=new char[ip.length];
        for (int i=0;i<data.length;i++){
            data[i]=ip[i];
        }
    }
    MyString(String ip){
        this(ip.toCharArray());
    }
    int length(){
        return data.length;
    }
    char charAt(int index){
        if(index<0&&index>data.length){
            throw new IndexOutOfBoundsException();
        }
           return data[index];
        
    }
    boolean equals(MyString other){
        if(data.length!=other.length()){
            return false;
        }
        for(int i=0;i<data.length;i++){
            if(data[i]!=other.data[i]){
                return false;
            }
        }return true;
    }
    MyString toUpperCase(){
        char[] newString=new char[data.length];
        for(int i=0;i<data.length;i++){
            if(data[i]>='a'&&data[i]<='z'){
                newString[i]=(char)(data[i]-32);
            }
            else{
                newString[i]=data[i];
            }
        }return  new MyString(newString);
    
    }
    MyString toLowerCase(){
        char[] newString=new char[data.length];
        for(int i=0;i<data.length;i++){
            if(data[i]>='A'&&data[i]<='Z'){
                newString[i]=(char)(data[i]+32);
            }
            else{
                newString[i]=data[i];
            }
        }return  new MyString(newString);
    
    }
    MyString substring(int start, int end){
        
        if(start>end||start<0||end>data.length){
            throw new IndexOutOfBoundsException();
        }
        char[] newString=new char[end-start];
        int j=0;        
        for(int i=start;i<end;i++){
            newString[j]=data[i];
            j++;
        }return new MyString(newString);
    
    }
    MyString concat(MyString other){
        char[] n=new char[(this.length())+(other.length())];
        for(int i=0;i<this.length();i++){
            n[i]=this.data[i];
        }
        for(int i=0;i<other.length();i++){
            n[i+this.length()]=other.data[i];
        }
        return new MyString(n);
    }
    boolean contains(MyString sub){
        int n=sub.length();
        int m=this.length();
        for(int i=0;i<=m-n;i++){
            boolean ans=true;
            for(int j=0;j<n;j++){
                if(this.data[i+j]!=sub.data[j]){
                    ans=false;
                    break;

                }
            }if(ans){
                return ans;
            }
        }return false;
    }
    int indexOf(char ch){
        int ans=-1;
        for(int i=0;i<this.length();i++){
            if(data[i]==ch){
                ans=i;
                break;
            }
        }return ans;
    }
    MyString replace(char oldChar, char newChar){
        char[] result=new char[this.length()];
        for(int i=0;i<this.length();i++){
            if(this.data[i]==oldChar){
                result[i]=newChar;
            }
            else{
                result[i]=this.data[i];
            }
        }return new MyString(result);
    }
    @Override
    public String toString(){
        return new String(data);
    }

}
public class D4Six {
    public static void main(String[] args) {
        MyString s1=new MyString("Chiranjeevi");
        MyString s2=new MyString("jeevi");
        System.out.println("Length of S1 is "+s1.length());
        System.out.println("Character at index 1 is "+s1.charAt(1));
        System.out.println("S1 is equal to S2: "+s1.equals(s2));
        System.out.println("UpperCase of s1 is "+s1.toUpperCase());
        System.out.println("LowerCase of s1 is "+s1.toLowerCase());
        System.out.println("Substring "+s1.substring(1,6));
        System.out.println("Concat "+s1.concat(s2));
        System.out.println("Contains s1 in s2: "+s1.contains(s2));
        System.out.println("Index of 'e' is "+s1.indexOf('e'));
        System.out.println("Replacing s instead of c "+s1.replace('c','s'));
    }
    
}
