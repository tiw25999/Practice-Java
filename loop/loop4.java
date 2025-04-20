import java.util.Scanner;
public class loop4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num,count = 0;
        System.out.print("Enter num: ");
        num = in.nextInt();
        while(num >= 0){
            num += num;
            count++;
            System.out.print("Enter num: ");
            num = in.nextInt();
                if(num == 9999){
                    num = num / count;
                    System.out.print("Average: "+num);
                    return;
                }
        }
    }
}
