class Diff {
    int n=10;
}
  class Sum extends Diff{
    Sum(){
       // System.out.println("This gives the Sum");
    }
}public class Ten{
    public static void main(String[] args) {
        Ten a=new Ten();
        Sum b=new Sum();
        if( b instanceof Diff) {
            System.out.println("b is a insatance of Diff");
        }
    }
}
