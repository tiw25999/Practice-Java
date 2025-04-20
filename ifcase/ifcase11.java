import java.util.Scanner;
public class ifcase11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("*   yellow  = input y");
        System.out.println("*   magenta = input m");
        System.out.println("*   cyan    = input c");
        System.out.print("Enter you Color: ");
        char color = input.next().charAt(0);
        String Mes = "";

        switch(color){
            case 'y':
            case 'Y':
                Mes = "Yellow is made by combining red and green.";
                break;
            case 'm':
            case 'M':
                Mes = "Magenta is made by combining red and blue.";
                break;
            case 'c':
            case 'C':
                Mes = "Cyan is made by combining green and blue.";
                break;
            default:
        }
        System.out.print(""+Mes);
    }
}
