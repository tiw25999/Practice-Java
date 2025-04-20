import java.util.Scanner;
public class ifcase {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int Number = input.nextInt();

        if (Number % 3 == 0 && Number % 5 == 0){
            System.out.print("FizzBuzz");
        } else if(Number % 3 == 0){
            System.out.println("Fizz");
        }    else if(Number % 5 == 0){
            System.out.print("Buzz");
            }else
            System.out.print(""+Number);
            input.close();
        }
    }
            
