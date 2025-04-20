import java.util.Scanner;
public class loop7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = in.nextInt();
        for(int i = 2; i <= num; i++){
            boolean check = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    check = false;
                }
            }
            if(check){
                System.out.print(i+",");
                }
            }
            }
    }
