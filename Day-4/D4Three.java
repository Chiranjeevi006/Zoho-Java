class Point{
    Point(){

    } 
    void setPoint(int x,int y){
        this.x=x;
        this.y=y;
    } 
    int getX(){
        return x;
    } 
    int getY(){
        return y;
    } 
    void printPoint(){
        System.out.println(x +","+y);
    } 
    private int x;
    private int y;
    }
class Circle extends Point{
    private double radius;
    public Circle(){

    }
    public void setRadius(double r){
        if(r>0){
            radius=r;
        }
        else{
            radius=1;
        }
    }
    public  double getRadius(){
        return radius;
    }
    /*public void area(){

    }*/
    double area(){
        return ((22/7)*radius*radius);
    }
}
public class D4Three {
    public static void main(String[] args) {
        Circle n1=new Circle();
        n1.setPoint(4,5);
        n1.setRadius(5);
        n1.printPoint();
        System.out.println("Radius of Circle is:" +n1.getRadius());
        System.out.println("The area of Circle is: "+n1.area());
    }
}