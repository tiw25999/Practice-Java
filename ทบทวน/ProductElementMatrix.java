import java.util.Scanner;
public class ProductElementMatrix {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter matrix row and colum: ");
        int row = in.nextInt();
        int colum = 0;
        if(row != 0){
            colum = in.nextInt();
        }
        int sum = 1;
        System.out.print("Enter start number: ");
        int number = in.nextInt();
        for(int i = 0; i < row; i++){
            for(int j = 0;j < colum; j++){
                System.out.printf("%5d",number);
                sum *= number;
                number++;
                
            }
            System.out.println();
        }
        System.out.print("Product: "+sum);
    }
}
