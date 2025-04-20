import java.util.Scanner;
public class test001 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month(for instance 'jan'): ");
        String month = input.next().substring(2, 4);
        System.out.print(month);




        input.close();
    }
}


