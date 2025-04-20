import java.util.Scanner;
public class loop16 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double sum = 0,number1 = 1, number2 = 1;
        while(number1 != 0 && number2 != 0 ){
            number1 = 0; number2 = 0;
            System.out.print("Enter number1: ");
            number1 = in.nextDouble();
            System.out.print("Enter number2: ");
            number2 = in.nextDouble();
            if(number1 != 0 && number2 != 0){
            System.out.print("Operator: ");
            char opre = in.next().toLowerCase().charAt(0);
            if(number1 == 0 && number2 == 0){
                return;
            }else if( opre == '+'){
                sum = number1 + number2;
                System.out.println("Answer of "+number1+( " + " )+number2+" is "+sum);
            }else if( opre == '-'){
                sum = number1 - number2;
                System.out.println("Answer of "+number1+( " - " )+number2+" is "+sum);
            }else if( opre == '*'){
                sum = number1 * number2;
                System.out.println("Answer of "+number1+( " * " )+number2+" is "+sum);
            }else if( opre == '/'){
                sum = number1 / number2;
                System.out.println("Answer of "+number1+( " / " )+number2+" is "+sum);
            }else System.out.println("Operator Error");
        }
    }
    }
}
