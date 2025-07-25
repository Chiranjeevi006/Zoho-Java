interface hii{
    void name();
    void age();
}
interface hello{
    void height();
}
class main implements hii,hello {

    public void age(){
        System.out.println("20");
    }public void name(){
        System.out.println("Kalai");
    }public void height(){
        System.out.println("5.5");
    }
}
class Main{
    public static void main(String[] args) {
        main m=new main();
        m.age();
        m.name();
        m.height();System.out.println("Try programiz.pro");
    }
}