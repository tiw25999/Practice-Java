import java.util.Scanner;
public class testarray02 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[][] n = new int[3][4];
        int[][] n2 = new int[3][4];
        int[][] n3 = new int[3][4];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                n[i][j] = j;
                n[i][j] = j;
                System.out.print("eENter number ");
                n[i][j] = in.nextInt();
            }
        }

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                n3[i][j] = n2[i][j] + n[i][j];
                System.out.print(n3[i][j]+" ");
            }
            System.out.println();
        }
    }
    }

