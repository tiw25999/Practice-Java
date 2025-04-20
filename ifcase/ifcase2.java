import java.util.Scanner;
public class ifcase2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int price = 0;

        System.out.println("Welcome to pizza");
        System.out.println("Choose a pizza size(S,M,L,X)");
        System.out.print("Enter Size for pizza: ");
        char Size = input.next().charAt(0);

        switch (Size) {
            case 's':
            case 'S':
                price += 40;
                System.out.println(price+" Bath");
                System.out.print("Enter you item: ");
                int s = input.nextInt();
                s =  s * price;
                System.out.print(s+" Bath");
                break;
            case 'm':
            case 'M':
                price += 65;
                System.out.println(price+" Bath");
                System.out.print("Enter you item: ");
                int m = input.nextInt();
                m =  m * price;
                System.out.print(m+" Bath");
                break;
            case 'l':
            case 'L':
                price += 85;
                System.out.println(price+" Bath");
                System.out.print("Enter you item: ");
                int l = input.nextInt();
                l =  l * price;
                System.out.print(l+" Bath");
                break;
            case 'x':
            case 'X':
                price += 150;
                System.out.println(price+" Bath");
                System.out.print("Enter you item: ");
                int x = input.nextInt();
                x =  x * price;
                System.out.print(x+" Bath");
                break;
            default :
                System.out.print("Invalid pizza size");
        }
        input.close();
    }
}
