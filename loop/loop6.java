import java.util.Scanner;
public class loop6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double age = 0, peo = 0,aver = 0, min = Double.MAX_VALUE,max = Double.MIN_VALUE,count = 0;
        // min = ค่าสูงสุดที่เป็นไปได้ที่เก็บใน Double
        // max = ค่าตํ่าสุดที่เป็นไปได้ใน Double
        System.out.print("Enter Num for People: ");
        peo = in.nextInt();
        while (peo > 0 && count < peo){
            System.out.print("Enter you age: ");
            age = in.nextInt();
            count ++;
            aver += age;
            min = (Math.min(min,age));
            max = (Math.max(max,age));
            
        }
        if(peo > 0){
            aver /= peo;
            System.out.printf("Min = : %.0f\n",min);
            System.out.printf("Max = : %.0f\n",max);
            System.out.printf("Aver = : %.3f\n",aver);
        }else System.out.print("Invalid Input");
    }
}
