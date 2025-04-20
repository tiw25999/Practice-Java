import java.util.Scanner;
public class HexaDecimal {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter integer(1-15): ");
        int inte = in.nextInt();
        String mes = "HexaDecimal = ";

        switch(inte){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.print("HexaDecimal = "+inte);
                break;
            case 10:
                mes += "A";
                break;
            case 11:
                mes += "B";
                break;
            case 12:
                mes += "C";
                break;
            case 13:
                mes += "D";
                break;
            case 14:
                mes += "E";
                break;
            case 15:
                mes += "F";
                break;
            default: System.out.print("Error");
            return;
        }
        System.out.print(mes);
    }
}
