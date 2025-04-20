import java.util.Scanner;
public class ifcase10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month(for instance 'jan'): ");
        String month = input.next().substring(0, 3).toLowerCase();
        System.out.print("Enter a day fo the month(1-31): ");
        int day = input.nextInt();
        boolean check = false;

        switch (month) {
            case "jan":
            case "mar":
            case "may":
            case "jul":
            case "aug":
            case "oct":
            case "dec":
                check = (day >= 1 && day <= 31);
                break;
            case "apr":
            case "jun":
            case "sep":
            case "nov":
                check = (day >= 1 && day <= 30);
                break;
            case "feb":
                check = (day >= 1 && day <= 29);
                break;
        }

        if (check) {
            System.out.print("Correct");
        } else {
            System.out.print("Invalid day has been entered");
        }

        input.close();
    }
}
