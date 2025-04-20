import java.util.Scanner;

public class ifcase8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you Vowel or Consonant: ");
        char five = input.next().charAt(0);
        
        switch(five){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.print("Vowel");
                break;
            default:
                System.out.print("Consonant");
        }
        input.close();
    }
}
