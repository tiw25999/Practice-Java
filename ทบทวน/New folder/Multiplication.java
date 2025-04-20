import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char yn = 'y';
        boolean check = true;
        while(yn == 'y'){
            check = true;
            System.out.print("number: ");
            int number = in.nextInt();
            if(number <= 12 && number > 0){
                displaymul(number);
            }else {System.out.println("Invalid");
            check = false;}
            if(check){
            System.out.print("Do you want to continue [y/n]: ");
            yn = in.next().toLowerCase().charAt(0);
            if(yn != 'y' && yn != 'n'){
            System.out.print("input only y or n");
        }
            }
        }
        }
    

        public static void displaymul(int number) {
            for (int i = 1; i <= 12; i++) {
                int result = number * i;
                System.out.println(number + " x " + i + " = " + result);
            }
        }
}
