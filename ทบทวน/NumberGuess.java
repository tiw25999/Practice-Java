import java.util.Scanner;
public class NumberGuess {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = 0,count = 0;
        int ran = (int) (Math.random()*100);
        do {
            System.out.print("Key in your number: ");
            num = in.nextInt();
            if(num == ran){
                System.out.println("Congratulation! "+num+" is Secrect Number");}
            else if(num < ran){
                System.out.println("Try higher");
            }else if(num > ran){
                System.out.println("Try lower");
            }
            count++;
            }while(num != ran);
                System.out.print("You got it in "+count+" trials!");
        }
    }


