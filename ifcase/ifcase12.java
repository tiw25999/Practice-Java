import java.util.Scanner;
public class ifcase12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is you name: ");
        String nameser = input.next();
        String namelas = input.next();
        System.out.print("How lod are you: ");
        int age = input.nextInt();
        System.out.print("Are you male or female(M,F): ");
        char sex = input.next().charAt(0);
        String Mes = "";
        
        if(age > 1 && age < 13){
            Mes = "You are a youth";}
        if(age >= 13 && age <= 19){
            Mes = "You are a teenage";
            Mes += "\nStay away from drugs";}
        if(age >=20 && age <= 30){
            Mes = "You are an adult";
            Mes += "\nHave fun in college";}
        if(age >=31 && age <= 50);{
            Mes = "You are in middle age";
            Mes += "\nPlease work hard";}
        if(age > 51){
            Mes = "You are a senior citizen";
            Mes += "\nEnjoy old age";}
        System.out.print(Mes);
        input.close();
    }
}