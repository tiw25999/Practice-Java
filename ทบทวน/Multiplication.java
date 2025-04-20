import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sum = 0,count = 0,num = 0;
        char yn = 'y';
        boolean inva = true;
        while(yn == 'y'){
            inva = true;
            System.out.print("Number[2 to 12]: ");
            num = in.nextInt();
            if(num >= 2 && num <= 12){
                while(count < 12){
                    count++;
                    sum = num * count;
                    System.out.println(num+" x "+count+" = "+sum);
                }
                count = 0;
                if(inva){
                    System.out.print("Do you want to continue [y/n]: ");
                    yn = in.next().toLowerCase().charAt(0);
                    if(yn != 'y' && yn != 'n'){
                    System.out.print("you can only input y or n");
                        }
        }
    }else {System.out.println("Invalid");
                                inva = false;     }
}
    }
}

