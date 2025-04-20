import java.util.Scanner;
public class method005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter month[1-12]: ");
        int m = in.nextInt();
        getmonth(m);
    }
    public static int getmonth(int m){
        String[] monthjan = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println(monthjan[m-1]);
        return 0;
    }
}
