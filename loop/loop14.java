import java.util.Scanner;
public class loop14 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num: ");
        int number = in.nextInt();
        int count = 0;
        for(int i = 1; i <= number; i++){
                if(i <= 32){
                    System.out.printf("%8d",i);
                    count++;
                    if(count == 8){
                        System.out.println("");
                        count = 0;
                }
            }
            }
        }
}