import java.util.Scanner;
public class iftest19_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum   = 0;
        int count = 0;
        
        System.out.print("Enter you Charector: ");
        char a_z = input.next().charAt(0);
        if(a_z == 'a' || a_z == 'A'){
            sum += 10;
            count++;}
        else if(a_z == 'b' || a_z == 'B'){
            sum+= 20;
            count++;}
        else if(a_z == 'c' || a_z == 'C'){
            sum += 30;
            count++;}
        else
            System.out.print("Choose a,b,c");

        if(count < 3){
        System.out.print("Enter you Charector: ");
        char a_z2 = input.next().charAt(0);
        if(a_z2 == 'a' || a_z == 'A'){
            sum += 10;
            count++;}
        else if(a_z2 == 'b' || a_z == 'B'){
            sum+= 20;
            count++;}
        else if(a_z2 == 'c' || a_z == 'C'){
            sum += 30;
            count++;}
        }
        else
            System.out.print("Choose a,b,c");

        if (count < 3) {
        System.out.print("Enter you Charector: ");
        char a_z3 = input.next().charAt(0);
        if(a_z3 == 'a' || a_z == 'A'){
            sum += 10;
            count++;}
        else if(a_z3 == 'b' || a_z == 'B'){
            sum+= 20;
            count++;}
        else if(a_z3 == 'c' || a_z == 'C'){
            sum += 30;
            count++;}
        else
        System.out.print("Choose a,b,c");
            }
        System.out.print("Sum: "+sum);
        input.close();
    }
}
