import java.util.Scanner;
public class method006 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter character: ");
        char c = in.next().charAt(0);
        System.out.print("Enter round: ");
        int r = in.nextInt();
        printline(c,r);
    }

    public static int printline(char c,int n){
        for(int i = 0; i < n; i++){
            System.out.println(c);
        }
        return 0;
        
    }
}