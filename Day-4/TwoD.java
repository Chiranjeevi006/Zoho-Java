public class TwoD{
    protected double x;
    protected double y;
    TwoD(){
        System.out.println("\nTwoD default constructor");
    }
    TwoD(double x,double y){
        System.out.println("TwoD constructor with two arguments:");
        this.x=x;
        this.y=y;
    }

    void setX(double x){
        this.x=x;
    }
    void setY(double y){
        this.y=y;
    }
    double getX(){
        return x;
    }
    double getY(){
        return y;
    }
}
class ThreeD extends TwoD{
    double z;
    ThreeD(){
        
    }
    ThreeD(double x,double y,double z){
        super(x,y);
        this.z=z;
    }
    
    void setZ(double z){
        this.z=z;
    }
    double getZ(){
        return z;
    }
    double distance(ThreeD ip){
        double a=this.getX()-ip.getX();
        double b=this.getY()-ip.getY();
        double c=this.getZ()-ip.getZ();
        return Math.sqrt((a*a)+(b*b)+(c*c));
    }

}
class main {
    public static void main(String[] args) {
        ThreeD n1=new ThreeD();
        n1.setX(5);
        n1.setY(10);
        n1.setZ(20);
        ThreeD n2=new ThreeD(2,6,9);
        System.out.println("Distance between P1 and P2 is: "+n1.distance(n2));
    }
}