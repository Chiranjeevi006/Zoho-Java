class vehicle{
    int mileage;
    int price;
    vehicle(int mileage,int price){
        this.mileage=mileage;
        this.price=price;
    }
}
class Car extends vehicle{
    int OwnershipCost;
    int warrenty;
    int seatingcapacity;
    String fuelType;
    Car(int mileage,int price,int OwnershipCost,int warrenty,int seatingcapacity,String fuelType){
        super(mileage,price);
        this.OwnershipCost=OwnershipCost;
        this.warrenty=warrenty;
        this.seatingcapacity=seatingcapacity;
        this.fuelType=fuelType;
    }
}
class Bike extends vehicle{
    int cylinder;
    int gears;
    String coolingType;
    String WheelType;
    float Fueltanksize;
    Bike(int mileage,int price,int cylinder,int gears,String coolingType,String WheelType,float Fueltanksize){
        super(mileage,price);
        this.cylinder=cylinder;
        this.gears=gears;
        this.coolingType=coolingType;
        this.WheelType=WheelType;
        this.Fueltanksize=Fueltanksize;
    }
}
class Audi extends Car{
    String Model_type;
    Audi(String Model_type,int mileage,int price,int OwnershipCost,int warrenty,int seatingcapacity,String fuelType){
        super(mileage,price,OwnershipCost,warrenty,seatingcapacity,fuelType);
        this.Model_type=Model_type;
    }
    void display(){
        System.out.println("\nAudi Car Details:");
        System.out.println("\nModel_type: "+Model_type+"\nmileage: "+mileage+"\nprice"+price+"\nOwnershipCost:"+OwnershipCost+"\nwarrenty:"+warrenty+"\nseatingcapacity: "+seatingcapacity+"\nfuelType: "+fuelType);
    }
}
class Ford extends Car{
    String Model_type;
    Ford(String Model_type,int mileage,int price,int OwnershipCost,int warrenty,int seatingcapacity,String fuelType){
        super(mileage,price,OwnershipCost,warrenty,seatingcapacity,fuelType);
        this.Model_type=Model_type;
    }
    void display(){
        System.out.println("\nFord Car Details:");
        System.out.println("\nModel_type: "+Model_type+"\nmileage: "+mileage+"\nprice"+price+"\nOwnershipCost:"+OwnershipCost+"\nwarrenty:"+warrenty+"\nseatingcapacity: "+seatingcapacity+"\nfuelType: "+fuelType);
    }
}
class Bajaj extends Bike{
    String make_type;
    Bajaj(String make_type,int mileage,int price,int cylinder,int gears,String coolingType,String WheelType,float Fueltanksize){
        super(mileage,price,cylinder,gears,coolingType,WheelType,Fueltanksize);
        this.make_type=make_type;
    }
    void display(){
        System.out.println("Bajaj Bike Details:\n");
        System.out.println("Make Type: " + make_type);
        System.out.println("Cylinders: " + cylinder);
        System.out.println("Gears: " + gears);
        System.out.println("Cooling Type: " + coolingType);
        System.out.println("Wheel Type: " + WheelType);
        System.out.println("Fuel Tank Size (inches): " + Fueltanksize);
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);
        System.out.println();
    }
}
class TVS extends Bike{
    String make_type;
    TVS(String make_type,int millage,int price,int cylinder,int gears,String coolingType,String WheelType,float Fueltanksize){
        super(millage,price,cylinder,gears,coolingType,WheelType,Fueltanksize);
        this.make_type=make_type;
    }
    void display(){
        System.out.println("TVS Bike Details:\n");
        System.out.println("Make Type: " + make_type);
        System.out.println("Cylinders: " + cylinder);
        System.out.println("Gears: " + gears);
        System.out.println("Cooling Type: " + coolingType);
        System.out.println("Wheel Type: " + WheelType);
        System.out.println("Fuel Tank Size (inches): " + Fueltanksize);
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);
        System.out.println();
    }
}
public class D4One {
    public static void main(String[] args) {
        Audi audi = new Audi("A6", 15, 5000000, 150000, 5, 5, "Petrol");
        audi.display();
        Ford ford = new Ford("Endeavour", 12, 3500000, 120000, 4, 7, "Diesel");
        ford.display();
        Bajaj bajaj = new Bajaj("Pulsar 220", 45, 130000, 1, 5, "Air", "Alloys", 14);
        bajaj.display();
        TVS tvs = new TVS("Apache RTR", 50, 110000, 1, 5, "Oil", "Spokes", 12);
        tvs.display();
    }
}
