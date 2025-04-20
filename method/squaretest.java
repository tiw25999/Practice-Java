import java.util.Scanner;
public class squaretest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        square[] squares = new square[2];

        for(int i = 0; i < 2; i++){
            System.out.print("Enter the width of square " + (i + 1) + ": ");
            int w = in.nextInt();
            squares[i] = new square(w);
            
        }
        System.out.println("\n Display squares in formation: ");

        for(int i = 0; i < 2; i++){
            System.out.println(squares[i].toString());
            }
            System.out.println("\n Enter new width of 1 st square: ");
            squares[0].setWidth(in.nextInt());

            System.out.println("\n Enter new width of 2 nd square: ");
            squares[1].setWidth(in.nextInt());

            System.out.println("\n Display squares in formation: ");
            for(int i = 0; i < 2; i++){
                System.out.println(squares[i].toString());
            }

        
    }
}
