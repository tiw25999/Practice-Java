import java.util.Scanner;
public class QueenContest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("No. 2 Enter height: ");
        char feetchar = input.next().toLowerCase().charAt(0);
        double feet = input.nextDouble();
        double inch = input.nextDouble();
        System.out.print("No. 2 Enter height: ");
        char feetchar2 = input.next().toLowerCase().charAt(0);
        double feet2 = input.nextDouble();
        double inch2 = input.nextDouble();
        char schar = feetchar;
        schar = feetchar2;
        double feets,inchs,cm,feetss,inchss,cms;
        boolean sum = false;

        if(feetchar == f && feetchar2 == c){
                switch(schar){
                case 'f':
                    feets = feet * 12;
                    inchs = feet + inch;
                    cm = inchs * 2.54;
                    break;
                case 'c':
                    feet2 = feet2 + 0;
                    break;
                default: System.out.print("Error");
        }
            sum = (cm > feet2);
                System.out.print("No. 1 is "+cm+" cm and No. 2 is "+feet2+" cm.");
                System.out.print("No. 1 is  taller");
            sum =(feet2 > cm);
                System.out.print("No. 1 is "+cm+" cm and No. 2 is "+feet2+" cm.");
                System.out.print("No. 2 is  taller");
        }else if(feetchar == f && feetchar2 == f){
                switch(schar){
                case 'f':
                    feets = feet * 12;
                    inchs = feet + inch;
                    cm = inchs * 2.54;
                    break;
                    //no 1
                    feetss = feet2 * 12;
                    inchss = feets + inch2;
                    cms = inchs * 2.54;
                    break;
                    //no 2
                    break;
                default: System.out.print("Error");
        }
    }else if(feetchar == c && feetchar2 == f){
        switch(schar){
                case 'c':
                    feet = feet + 0;
                    break;
                case 'f':
                    feets = feet2 * 12;
                    inchs = feets + inch2;
                    cm = inchs * 2.54;
                    break;
                default: System.out.print("Error");
    }
   }else if(feetchar == c && feetchar2 == c){
        switch(schar){
                case 'c':
                    feet = feet + 0;
                    feet2 = feet2 + 0;
                    break;
                default: System.out.print("Error");
   }
}
}
}
