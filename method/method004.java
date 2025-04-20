import java.util.Scanner;
public class method004 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = in.nextLine();
        String sum = str(str);
        System.out.println(sum);
        
    }

    public static String str(String str){
        String sum = "";
        sum = str.substring(0,4);
        return sum;
    }
    
}
