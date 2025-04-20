package Association;
import java.util.ArrayList;
import java.util.Scanner;
public class SmartPhoneTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Human h = new Human("AAA",26,"38900055645");
        ArrayList <SmartPhone> Phone = new ArrayList <SmartPhone>();
        Phone.add(new SmartPhone("0819866339", "Huawei", "Android", 8, 64));
        Phone.add(new SmartPhone("0868884661", "iPhone", "IOS", 16, 128));
        Phone.add(new SmartPhone("065899772", "Oppo", "Android", 4, 64));
        Phone.add(new SmartPhone("0878884661", "iPhone", "IOS", 16, 128));
        Phone.add(new SmartPhone("095899772", "Oppo", "Android", 8, 128));
        
        h.SetPhone(Phone);

        
        System.out.println(h+" has "+h.getName().size()+" Smart Phones");
            int rom = 0;
            int ram = 0;
        for(int i = 0; i < h.getName().size(); i++) {
            SmartPhone s = h.getName().get(i);
            ram += s.getRam();
            rom += s.getMemory();
        }
        System.out.println("Total RAM: "+ram+" GB "+"Total ROM: "+rom+" GB");
        char yn = 'y';
        while (yn == 'y') {
            System.out.println("Select search by");
            System.out.println("1. Phone Number");
            System.out.println("2. Brand");
            System.out.println("3. ROM");
            System.out.println("4. OS");
            System.out.print("Select: ");
            int select = input.nextInt();
            switch (select) {
                case 1:
                    System.out.print("Enter Phone Number: ");
                    String number = input.next();
                    int countsearch = 0;
                    for (int i = 0; i < h.getName().size(); i++) {
                        SmartPhone s = h.getName().get(i);
                        if (s.getNumber().equals(number)) {
                            countsearch++;
                            System.out.print("AAA has "+countsearch);
                        }
                    }
                    if(countsearch > 0) {
                    System.out.print(" Smart Phone "+number);
                    System.out.println();
                    }else if(countsearch == 0){
                        System.out.println("not found"+number);
                    }
                    
                    break;
                case 2:
                    System.out.print("Enter Brand: ");
                    String brand = input.next();
                    int countsearch2 = 0;
                    for (int i = 0; i < h.getName().size(); i++) {
                        SmartPhone s = h.getName().get(i);
                        if (s.getBrand().equals(brand)) {
                            countsearch2++;
                            System.out.println("AAA has "+countsearch2);
                        }
                    }
                    if(countsearch2 > 0) {
                    System.out.print(" Smart Phone "+brand);
                    System.out.println();
                    }else if(countsearch2 == 0){
                        System.out.println("not found"+brand);
                    }
                    break;
                case 3:
                    System.out.print("Enter ROM: ");
                    int memory = input.nextInt();
                    for (int i = 0; i < h.getName().size(); i++) {
                        SmartPhone s = h.getName().get(i);
                        if (s.getMemory() == memory) {
                            System.out.println("AAA has "+s.getNumber()+" ");
                        }

                    }
                    break;
                case 4:
                    System.out.print("Enter OS: ");
                    String os = input.next();
                    for (int i = 0; i < h.getName().size(); i++) {
                        SmartPhone s = h.getName().get(i);
                        if (s.getOs().equals(os)) {
                            
                            System.out.println("AAA has "+s.getNumber()+" ");
                        }
                    }
            }
            System.out.println("Continue?(y/n)");
            yn = input.next().toLowerCase().charAt(0);
        }
        input.close();
    }
}
