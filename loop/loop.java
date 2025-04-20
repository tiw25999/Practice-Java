import java.util.Scanner;

public class loop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("input number with 2 floating point:");
        double num = input.nextDouble();

            while (num <= 30 && num >= 0){
                num += 3.33;
                    if(num <= 30){
                        System.out.println("Number + 3.33 = "+num);
                    }else
                        System.out.print("Sorry! No more than 30");
                        input.close();
            }
        }
        
        }

//