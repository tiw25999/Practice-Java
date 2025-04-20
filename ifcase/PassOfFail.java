import java.util.Scanner;
public class  PassOfFail{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Score1: ");
        int Score = input.nextInt();
        System.out.print("Enter Score2: ");
        int Score2 = input.nextInt();
        System.out.print("Enter Score3: ");
        int Score3 = input.nextInt();


        if(Score > 50 && Score2 > 50 && Score3 > 50){
            int sum = (Score + Score2 + Score3) / 3.0;
            System.out.println("Mean = "+sum);
            if(sum <= 100 && sum >= 86){
                System.out.print("Garde A");}
            else if(sum <= 85 && sum >= 66){
                    System.out.print("Garde B");}
            else if(sum <= 65 && sum >= 50){
                        System.out.print("Garde C");
                    }
            }
        else
        System.out.print("Fail");
        input.close();
        }

    }