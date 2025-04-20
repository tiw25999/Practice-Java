import java.util.Scanner;
public class loop5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int count = 0;
        System.out.print("Con: ");
        char con = in.next().toLowerCase().charAt(0);
        char choose;
        while(con != 'x'){
            count++;
            System.out.print("Con: ");
            con = in.next().toLowerCase().charAt(0);
                if(con == 'x'){
                    System.out.print("y or n");
                    choose = in.next().toLowerCase().charAt(0);
                    if(choose == 'y'){
                        System.out.println(""+count);
                        return;
                    }else if(choose == 'n'){
                        con = ' ';
                    }
                }
        }
    }
}
