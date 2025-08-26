/*Illustrates with an example of using Singleton class. */
class SingletonClass{
    public static SingletonClass obj=null;
    private SingletonClass(){
        System.out.println("Object is created..");
    }
    public static SingletonClass createObject(){
        if(obj==null){
            obj=new SingletonClass();
        }
        else{
            System.out.println("Object can't create");
        }return obj;
    }
    void show(){
        System.out.println("Hii");
    }
}
public class D8One {
    public static void main(String[] args) {
        SingletonClass s1=SingletonClass.createObject();
        SingletonClass s2=SingletonClass.createObject();
        s1.show();
        s2.show();
    }
}
