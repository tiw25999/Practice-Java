import java.util.Scanner;
public class testcase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter: ");
        char oo = in.next().toLowerCase().charAt(0);
        String mes = "Min = "; //เป็นการเว้นว่างให้ใส่ข้อความ

        int x = 5;     // บรรทัดนี้ x จะมีค่า = 5
            x = 11111;  // แต่พอมา บรรทัดนี้ x มีค่า = 11111
        System.out.print(x);
        
        switch (oo) {
            case 'a':
                mes = "AAA";
                break;
            case 'm':
                mes = "MMM";
                break;
            default:
                mes = "Not a case";
        }
        
        System.out.println(mes);
}
}
