/*int[] arr = {2, 5, 1, 4, 0, 7};
int quotient = arr[7] / arr[4];
Develop a Java program which handles any unexpected situations that may arise during execution. */
public class D9One{
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 4, 0, 7};
        try{
            int quotient = arr[7] / arr[4];
            System.out.println("Quotient of arr[7] / arr[4] is: "+quotient);
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Give valid Operation");
        }

    }
}
