/*Design the Vehicle class that stores information about a vehicle such as its vehicle ID, brand name, and 
price, such that it can internally keep track of how many vehicles have been created so far, without requiring manual counting from outside the class.*/
public class Vehicle {
    static int Vehiclecount=0;
    int id;
    String Brand_name;
    int price;
    Vehicle(int id,String Brand_name,int price){
        this.id=id;
        this.Brand_name=Brand_name;
        this.price=price;
        Vehiclecount++;
     }
     void display(){
        System.out.println("Vehicle Id: "+id+"\nBrand name: "+Brand_name+"\nPrice: "+price);
        System.out.println();
     }
      static void showVehicleCount(){
        System.out.println("Total count of Vehicle is: "+Vehiclecount);
     }
     public static void main(String[] args) {
        Vehicle v1=new Vehicle(536, "KTM",243475);
        Vehicle v2=new Vehicle(644,"TVS",78000);
        v1.display();
        v2.display();
        showVehicleCount();

     }
    
}
