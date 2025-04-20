public class loop18 {
    public static void main(String[] args) {
        final int line = 20;
        for(int row = 1; row <= line ; row ++) {
            for(int colum = 1; colum <= line - row; colum ++) {
                System.out.print(" ");
            }
            for(int num = row; num >= 1; num--) {
                //System.out.print("*");
                System.out.print(num);
            }
            for(int num = 2; num <= row; num ++) {
                //System.out.print("*");
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
