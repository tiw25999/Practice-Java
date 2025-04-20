import java.util.Scanner;
public class loop8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num: ");
        int number = in.nextInt();
        int count = 0;
        for(int i = 2; i <= number; i++){
                if( i % 2 == 0){
                    System.out.printf("%13d",i);
                    count++;
                    if(count == 5){
                        System.out.println("");
                        count = 0;
                }
            }
            }
        }
}
