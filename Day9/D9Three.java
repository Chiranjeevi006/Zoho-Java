/*Write a program to illustrate how to throw a ClassNotFoundException. */
public class D9Three {
    public static void main(String[] args) {
       try{
            Class.forName("ello");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
