import java.util.Scanner;
public class findabovemean {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    char yn = 'y';
    while(yn == 'y'){
        System.out.print("Enter n: ");
        int num = in.nextInt();
        double[] carray = new double[num];
        double mean = 0;
        double sum = 0;

        for (int i = 0; i < num; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            carray[i] = in.nextDouble();
            sum += carray[i];
        }
        mean = sum / num;
        System.out.println("Mean: " + mean);
        System.out.println("Numbers above the mean:");
        for (int i = 0; i < num; i++) {
            if (carray[i] > mean) {
                System.out.println(carray[i]);
            }
        }
        System.out.print("Do you want cantinue [y/n]: ");
yn = in.next().toLowerCase().charAt(0);
    }


}
}
