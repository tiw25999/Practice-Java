import java.util.Scanner;

public class QueenContest1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("No. 1 Enter height: ");
        char feetchar = input.next().toLowerCase().charAt(0);
        double feet = input.nextDouble();
        double inch = input.nextDouble();
        System.out.print("No. 2 Enter height: ");
        char feetchar2 = input.next().toLowerCase().charAt(0);
        double feet2 = input.nextDouble();
        double inch2 = input.nextDouble();
        double cm,cm2,inchsum2,inchsum;
        if(feetchar == 'f' || feetchar == 'c' && feetchar2 == 'f' || feetchar2 == 'c'){
        if(feetchar == 'f' && feetchar2 == 'c') {
            inchsum = feet * 12;
            cm = (inchsum + inch) * 2.54;
                if(cm > feet2){
                    System.out.print("No. 1 is "+cm+" cm and No. 2 is "+feet2+" cm.");
                    System.out.print("No. 1 is taller");
                }else if(feet2 > cm){
                    System.out.print("No. 1 is "+cm+" cm and No. 2 is "+feet2+" cm.");
                    System.out.print("No. 2 is taller");
                }else {
                    System.out.print("No. 1 is "+cm+" cm and No. 2 is "+feet2+" cm.");
                    System.out.print("They are the same height");
                }
        }
        else if(feetchar == 'f' && feetchar2 == 'f') {
                inchsum = feet * 12;
                cm = (inchsum + inch) * 2.54;
                inchsum2 = feet2 * 12;
                cm2 = (inchsum2 + inch2) * 2.54;
                    if(cm > cm2) {
                        System.out.print("No. 1 is "+cm+" cm and No. 2 is "+cm2+" cm.");
                        System.out.print("No. 1 is taller");
                    }
                    else if(cm2 > cm) {
                        System.out.print("No. 1 is "+cm+" cm and No. 2 is "+cm2+" cm.");
                        System.out.print("No. 2 is taller");
                    }
                    else {
                        System.out.print("No. 1 is "+cm+" cm and No. 2 is "+cm2+" cm.");
                        System.out.print("They are the same height");
            }
        }
        else if(feetchar == 'c' && feetchar2 == 'f') {
            inchsum2 = feet2 * 12;
            cm2 = (inchsum2 + inch2) * 2.54;
                if(feet > cm2){
                    System.out.print("No. 1 is "+feet+" cm and No. 2 is "+cm2+" cm.");
                    System.out.print("No. 1 is taller");
                }else if(cm2 > feet){
                    System.out.print("No. 1 is "+feet+" cm and No. 2 is "+cm2+" cm.");
                    System.out.print("No. 2 is taller");
                }else {
                    System.out.print("No. 1 is "+feet+" cm and No. 2 is "+cm2+" cm.");
                    System.out.print("They are the same height");
                }
        }
        else if(feetchar == 'c' && feetchar2 == 'c') {
            if(feet > feet2){
                System.out.print("No. 1 is "+feet+" cm and No. 2 is "+feet2+" cm.");
                System.out.print("No. 1 is taller");
            }else if(feet2 > feet){
                System.out.print("No. 1 is "+feet+" cm and No. 2 is "+feet2+" cm.");
                System.out.print("No. 2 is taller");
            }else {
                System.out.print("No. 1 is "+feet+" cm and No. 2 is "+feet2+" cm.");
                System.out.print("They are the same height");
            }
        }
    }else System.out.print("Error");
}
}
