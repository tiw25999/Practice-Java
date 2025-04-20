import java.util.Scanner;
public class loop5_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int count = 0;
        System.out.print("Con: ");
        char con = in.next().toLowerCase().charAt(0);
        char choose;

        if(!(con >= '0' && con <= '9')){
        //ในการเปรียบเทียบนี้ ใช้ con >= '0' && con <= '9' เพื่อตรวจสอบว่า con เป็นตัวเลขหรือไม่
        //ซึ่ง '0' แทนตัวเลข 0 และ '9' แทนตัวเลข 9 ซึ่งหมายถึงช่วงของตัวเลข 0 ถึง 9
        //ถ้า con เป็นตัวเลข การเงื่อนไขนี้จะเป็นจริง แต่ถ้า con ไม่ใช่ตัวเลข การเงื่อนไขนี้จะเป็นเท็จ
        //มีการใส่ !หน้า()ของเงื่อนไขเพื่อทำให้การทำงานของ con เมื่อ con ไม่ใช่ตัวเลข

        if(con != 'x' ){
            count++;
        while(con != 'x'){
            count++;
            System.out.print("Con: ");
            con = in.next().toLowerCase().charAt(0);
                if(con == 'x'){
                    System.out.print("y or n: ");
                    choose = in.next().toLowerCase().charAt(0);
                    if(choose == 'y'){
                        count--;
                        System.out.println(""+count);
                        return;
                    }else if(choose == 'n'){
                        con = ' ';
                        count--;
                    }
                }
        }
    }else if(con == 'x'){
        count++;
        System.out.print("y or n: ");
        choose = in.next().toLowerCase().charAt(0);
        if(choose == 'y'){
                        System.out.println("0");
                        return;
                    }else if(choose == 'n'){
                        con = ' ';
                        count--;
                    }
        while(con != 'x'){
            count++;
            System.out.print("Con: ");
            con = in.next().toLowerCase().charAt(0);
                if(con == 'x'){
                    System.out.print("y or n: ");
                    choose = in.next().toLowerCase().charAt(0);
                    if(choose == 'y'){
                        count--;
                        System.out.println(""+count);
                        return;
                    }else if(choose == 'n'){
                        con = ' ';
                        count--;
                    }
                }
        }
    }
    }else System.out.print("You can't input numberic");
}
}
