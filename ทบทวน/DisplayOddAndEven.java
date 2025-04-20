import java.util.Scanner;
public class DisplayOddAndEven {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Start Number : ");
        int number = in.nextInt();
        System.out.print("End Number : ");
        int number2 = in.nextInt();
        displayeven(number,number2);
        System.out.println();
        displayodd(number, number2);
    }
    
    public static void displayeven(int number,int number2){
        System.out.print("Even number : ");
        for(int i = number ; i < number2 ;i++){
            if( i % 2 == 0 ){
                System.out.print(" "+i);
                
            }
        }
    }
    public static void displayodd(int number,int number2){
        System.out.print("Odd number : ");
        for(int i = number; i < number2; i++){
            if( i % 2 != 0){
                System.out.print(" "+i);
            }
        }
    }
    
}
