import java.util.Scanner;
public class testarray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] c = new int[12];
        int sum = 1;
        for(int i = 0; i < c.length; i++){
            c[i] = sum;
            System.out.println(c[i]);
            sum = sum + 3 ;
            
        }
        boolean t = true;
        while (t) {
            System.out.println("Enter character: ");
            char[] point = in.nextLine().toCharArray();
            for(int i = 0; i < 4; i++){
                System.out.println(point[i]);
            }
        }

    }
}
