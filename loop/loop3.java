import java.util.Scanner;
public class loop3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.print("Enter Num: ");
        num = in.nextInt();
        if(num >= 0){
            while(num <= 100) {
            num += 2;
        }
        System.out.println("Final = "+num);
        }else System.out.print("Error");

        num = 0;
        if(num >= 0){
            do {
            num += 2;
        } while(num <= 100);
        System.out.println("Final2 = "+num);
        }

        num = 0;
        if(num >= 0){
            for(num = 0; num <= 100;){
                num += 2;
            }
            System.out.println("Final3 = "+num);
        }
    }
}
