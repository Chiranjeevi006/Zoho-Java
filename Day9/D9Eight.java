/*Design a login system that throws AuthenticationException if the username or password is incorrect. Handle it and
display a login failure message.*/
import java.io.File;
public class D9Eight {
    public static void main(String[] args) {
        File file=new File("//home//admin//IdeaProjects//DAY-1");
        String [] h=file.list();
        for(String hi:h){
            System.out.println(hi);
        }
    }
}
