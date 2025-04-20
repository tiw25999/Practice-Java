import java.util.Scanner;
public class method009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter multiplies: ");
        int multi = sc.nextInt();
        calmulti(multi);
    }

    public static int calmulti(int n) {
        int[] multiplies = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12};
        for (int i = 0; i < 12; i++) {
            System.out.println(n+" x "+multiplies[i]+" = "+multiplies[i] * n);
        }
        return  0;
    }
}
