import java.util.ArrayList;
class store{
    static String StoreName;
    static String StoreLocation;
    static ArrayList<product> productlist=new ArrayList<>();
    static void setStoreDetails(String Name,String Location){
        StoreName=Name;
        StoreLocation=Location;
    }
    static void displayStoreDetails(){
        System.out.println("Store Name: "+StoreName+"\nStore Location: "+StoreLocation);
    }
    static void addProduct(product p){
        productlist.add(p);
    }
    static void displayAllProducts(){
        for(product p:productlist){
            p.displayProduct();
        }
        
    }
    
}
class product{
    int Product_Id;
    String name;
    int price;
    int quantity;
    product(int Product_Id,String name,int price,int quantity){
        this.Product_Id=Product_Id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    void displayProduct(){
        System.out.println("\nProduct_Id: "+Product_Id+"\nProduct Name: "+name+"\nPrice: "+price+"\nQuantity: "+quantity);
    }
}
public class D3Five {
    public static void main(String[] args) {
        store.setStoreDetails("Dharani Store", "Vellore");
        product p1=new product(545,"Lays",5,55);
        product p2=new product(456, "MIlk", 10, 20);
        product p3=new product(54, "Juice", 100, 18);
        store.addProduct(p1);
        store.addProduct(p2);
        store.addProduct(p3);
        store.displayStoreDetails();
        store.displayAllProducts();
    }
    
}
