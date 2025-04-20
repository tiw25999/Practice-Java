import java.util.Scanner;
public class passorfailmethod {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean ispass = true;
        while(ispass){
            System.out.print("Enter score of student: ");
            int s1 = in.nextInt();
            int s2 = in.nextInt();
            int s3 = in.nextInt();
            int sum = 0;
            if(ispass(s1,s2,s3)){
                sum = (s1 + s2 + s3) / 3;
                System.out.print("Mean = "q);
            }else if(ispass(s1,s2,s3)){
                System.out.print("Fail");
            }
        }
    }
    
    public static boolean ispass(int s1,int s2,int s3){
        if(s1 >= 50 && s2 >= 50 && s3 >= 50){
            return true;
        }
        return false;
    }
}
