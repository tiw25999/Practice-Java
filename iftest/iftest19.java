import java.util.Scanner;
public class iftest19 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        System.out.print("Enter Charector: ");
        char charec = input.next().charAt(0);
        if(charec == 'a'|| charec == 'A'){
            sum +=10;
            count++;
        }
        else if(charec == 'b' || charec == 'B'){
            sum +=20;
            count++;
        }
        else if(charec == 'c' || charec == 'C'){
            sum +=30;
            count++;
        }
        else {
            System.out.print("Charector is not Correct");
        }



        if(count < 3){
            System.out.print("Enter Charector Again: " + (3 - count) + " Round: ");
            char charec2 = input.next().charAt(0);
        if(charec2 == 'a'|| charec == 'A'){
            sum +=10;
            count++;
        }
        else if(charec2 == 'b' || charec == 'B'){
            sum +=20;
            count++;
        }
        else if(charec2 == 'c' || charec == 'C'){
            sum +=30;
            count++;
        }
        else {
            System.out.print("Charector is not Correct");
        }
        }
        if(count < 3){
            System.out.print("Enter Charector Again: " + (3 - count) + " Round: ");
            char charec3 = input.next().charAt(0);
        if(charec3 == 'a'|| charec == 'A'){
            sum +=10;
        }
        else if(charec3 == 'b' || charec == 'B'){
            sum +=20;
        }
        else if(charec3 == 'c' || charec == 'C'){
            sum +=30;
        }
        else {
            System.out.print("Charector is not Correct");
        }
        }
        System.out.print("Sum: "+sum);
        input.close();
    }
}