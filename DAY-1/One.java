public class One {
     int age=21;
     final String name="Chiranjeevi";
     static float num=56.5f;
     void display(){
         int local=50;
         System.out.println("Name:"+name+"  age:"+age+"  num:"+num+"  local:"+local);
         if(age>18){
             boolean ans=true;
             System.out.println(ans);
         }
     }
}class hii{
    public static void main(String[] args) {
        One vd=new One();
        vd.display();
    }
}
