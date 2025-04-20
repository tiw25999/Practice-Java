import java.util.Scanner;
public class displaytemp {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] cans = new int [12];
        int i = 0;
        double min = Double.MAX_VALUE, max = Double.MIN_VALUE;
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};

        for(i = 0; i < 12; i++){
            System.out.print("Please enter temp of "+months[i]+":");
            cans[i] = in.nextInt();
            min = Math.min(cans[i], min);
            max = Math.max(cans[i],max);
        }
        System.out.println("Maximum temp is "+max+" and "+max+" is a temp of "+cans[i-1]);
        System.out.print("Minimum temp is "+min+" and "+min+" is a temp of "+cans[i-1]);

    }
}
