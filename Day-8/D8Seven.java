/*Develop a Java program to illustrate the usage of toString() method */
class example{
    int age;
    String name;
    example(int age,String name){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return "Name: "+name+" Age: "+age;
    }
}
public class D8Seven {
    public static void main(String[] args) {
        example e1=new example(18,"hello");
        System.out.println(e1);
    }
}
