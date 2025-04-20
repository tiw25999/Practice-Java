import java.util.Scanner;
public class Lotto3Card {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char playAgain;

        do {
            System.out.print("Enter n: ");
            int n = input.nextInt();

            int withinRangeCount = 0;
            int totalCount = 0;

            for (int i = 0; i < n; i++) {
                Card card1 = new Card();
                Card card2 = new Card();
                Card card3 = new Card();

                int sum = card1.getNumber() + card2.getNumber() + card3.getNumber();
                totalCount++;

                if (sum >= 10 && sum <= 19) {
                    withinRangeCount++;
                    System.out.println(card1.getNumber() + " " + card2.getNumber() + " " + card3.getNumber() + " summary is between 10 And 19");
                } else {
                    System.out.println(card1.getNumber() + " " + card2.getNumber() + " " + card3.getNumber() + " summary is Out of Range");
                }
            }

            double percentage = (double) withinRangeCount / totalCount * 100;
            System.out.printf("\nPercentage %.2f%%\n", percentage);

            System.out.print("Do you want to continue [y/n]: ");
            playAgain = input.next().charAt(0);
        } while (playAgain == 'y' || playAgain == 'Y');

        System.out.println("Bye Bye!!!");
    }
}