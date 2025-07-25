public class TwoB {
    public static void main(String[] args) {
        int row=5;
        int col=4;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0||j==0||(i==row/2
                )||((i>row/2)&&i==j+1)||(j==col-1&&i<row/2)){
                    System.out.print("R ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
