class Shape{
    void print(){
        System.out.println("This is a Shape");
    }
}
class Polygon extends Shape{ 
    void print(){
        System.out.println("Polygon is a Shape");
    }
}
class Rectangle extends Polygon{
    void print(){
        System.out.println("Rectangle is a Polygon");
    }
}
class Triangle extends Polygon{
    void print(){
        System.out.println("Triangle is a Polygon");
    }
}
class Square extends Rectangle{
    void print(){
        System.out.println("Square is a Rectangle");
    }
}
public class D4Five {
    public static void main(String[] args) {
        Shape A=new Shape();
        A.print();
        Polygon B=new Polygon();
        B.print();
        Rectangle C=new Rectangle();
        C.print();
        Triangle D=new Triangle();
        D.print();
        Square E=new Square();
        E.print();
    }
}
