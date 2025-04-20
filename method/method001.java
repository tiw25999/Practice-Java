import java.util.Scanner;

public class method001 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no of lines: ");
        int numlines = in.nextInt();
        String longestText = ""; // เก็บข้อความที่มีความยาวมากที่สุด

        for(int i = 1; i <= numlines; i++){
            String text = in.next().toLowerCase();
            int textLength = gettextlong(text);

            if (textLength > longestText.length()) {
                longestText = text;
            }
        }

        System.out.println("The longest string is : " + longestText);
    }

    public static int gettextlong(String text){
        return text.length();
    }
}