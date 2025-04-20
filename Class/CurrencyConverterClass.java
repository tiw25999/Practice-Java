import java.util.Scanner;
public class CurrencyConverterClass {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String[] thai = {"USD", "JPY", "BAHT","EUR","SEK"};
        Converter[] id = new Converter[5];
        char yn = 'y';
        while (yn == 'y') {
            System.out.println("Currency[Select]:Input:");
            for(int i = 0; i < id.length; i++){
            System.out.print(thai[i]+" ");
        }
            System.out.println();
            System.out.println("Enter Currency: ");
            String inputCurrency = input.next().toUpperCase().substring(0, 3);
            int count = CurrencyCase(id,inputCurrency,thai);
            System.out.println();
            System.out.println("Enter Currency: ");
            String outputCurrency = input.next().toUpperCase().substring(0, 3);
            System.out.println("Enter Amount: ");
            double amount = input.nextDouble();
            OutputCase(outputCurrency,amount,count);
            System.out.println("Continue?(y/n)");
            yn = input.next().charAt(0);
        }
        if(yn == 'n'){
            System.out.println("Bye");
        }
    }

    public static void OutputCase(String p,double amount,int c){
        if(c == 1){
        switch (p) {
            case "JPY":
                double jpy = 140;
                double result = amount * jpy;
                System.out.println(result+" JPY");
                break;
            case "BAH":
                double baht = 35;
                result = amount * baht;
                System.out.println(result+" BAHT");
                break;
            case "EUR":
                double eur = 0.89;
                result = amount * eur;
                System.out.println(result+" EUR");
                break;
            case "SEK":
                double sek = 10.5;
                result = amount * sek;
                System.out.println(result+" SEK");
                break;
            default:
                break;
        }
    }

        if(c == 2){
        switch (p) {
            case "USD":
                double usd = 0.0067;
                double result = amount * usd;
                System.out.println(result+" USD");
                break;
            case "BAH":
                double baht = 0.24;
                result = amount * baht;
                System.out.println(result+" BAHT");
                break;
            case "EUR":
                double eur = 0.00062;
                result = amount * eur;
                System.out.println(result+" EUR");
                break;
            case "SEK":
                double sek = 0.073;
                result = amount * sek;
                System.out.println(result+" SEK");
                break;
            default:
                break;
        }
    }
    if(c == 3){
        switch (p) {
            case "USD":
                double usd = 0.028;
                double result = amount * usd;
                System.out.println(result+" USD");
                break;
            case "JPY":
                double jpy = 4.22;
                result = amount * jpy;
                System.out.println(result+" JPY");
                break;
            case "EUR":
                double eur = 0.026;
                result = amount * eur;
                System.out.println(result+" EUR");
                break;
            case "SEK":
                double sek = 0.031;
                result = amount * sek;
                System.out.println(result+" SEK");
                break;
            default:
                break;
        }
    }
    if(c == 4){
        switch (p) {
            case "USD":
                double usd = 1.07;
                double result = amount * usd;
                System.out.println(result+" USD");
                break;
            case "JPY":
                double jpy = 160.9;
                result = amount * jpy;
                System.out.println(result+" JPY");
                break;
            case "BAH":
                double baht = 38.09;
                result = amount * baht;
                System.out.println(result+" BAHT");
                break;
            case "SEK":
                double sek = 11.69;
                result = amount * sek;
                System.out.println(result+" SEK");
                break;
            default:
                break;
        }
    }
    if(c == 5){
        switch (p) {
            case "USD":
                double usd = 0.092;
                double result = amount * usd;
                System.out.println(result+" USD");
                break;
            case "JPY":
                double jpy = 13.76;
                result = amount * jpy;
                System.out.println(result+" JPY");
                break;
            case "BAH":
                double baht = 3.26;
                result = amount * baht;
                System.out.println(result+" BAHT");
                break;
            case "EUR":
                double eur = 0.086;
                result = amount * eur;
                System.out.println(result+" EUR");
                break;
            default:System.out.println("Invalid input");
                break;
        }
    }
}
        

    public static int CurrencyCase(Converter[] id,String n,String[] thai){ {
        switch (n) {
            case "USD":
                    System.out.println("Currency[Select]:Output:");
                    for(int i = 1; i < id.length; i++){
                    System.out.print(thai[i]+" ");}
                    int countusd = 1;
                    return countusd;
            case "JPY":
                    System.out.println("Currency[Select]:Output:");
                    for(int i = 2; i < id.length; i++){
                    System.out.print(thai[i]+" ");}
                    System.out.print(thai[0]+" ");
                    int countjpy = 2;
                    return countjpy;
            case "BAH":
                    System.out.println("Currency[Select]:Output:");
                    for(int i = 3; i < id.length; i++){
                    System.out.print(thai[i]+" ");}
                    for(int i = 0; i < 2; i++){
                    System.out.print(thai[i]+" ");}
                    int countbat = 3;
                    return countbat;
            case "EUR":
                    System.out.println("Currency[Select]:Output:");
                    System.out.print(thai[4]+" ");
                    for(int i = 0; i < 3; i++){
                    System.out.print(thai[i]+" ");}
                    int counteur = 4;
                    return counteur;
            case "SEK":
                    System.out.println("Currency[Select]:Output:");
                    for(int i = 0; i < 4; i++){
                    System.out.print(thai[i]+" ");}
                    int countsek = 5;
                    return countsek;
            default:System.out.println("Invalid input");
                break;
        }
        return 0;
    }

}
}

