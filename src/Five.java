public class Five {
    static{
        System.out.println("Static block");
    }
    {
        System.out.println("Initializer block");
    }
    Five(){
        System.out.println("Constructor Block");
    }

    public static void main(String[] args) {
       Five demo1=new Five();
        System.out.println("________________________");
        Five demo2=new Five();
    }
}
