package Association;
import java.util.ArrayList;
import java.util.Scanner;
public class SmartPhoneTest2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Human h = new Human("AAA",26,"38900055645");
        ArrayList <SmartPhone> Phone = new ArrayList <SmartPhone>();
        Phone.add(new SmartPhone("0819866339", "Huawei", "Android", 8, 64));
        Phone.add(new SmartPhone("0868884661", "iPhone", "IOS", 16, 128));
        Phone.add(new SmartPhone("065899772", "Oppo", "Android", 4, 64));
        Phone.add(new SmartPhone("0878884661", "iPhone", "IOS", 16, 128));
        Phone.add(new SmartPhone("095899772", "Oppo", "Android", 8, 128));
        Phone.add(new SmartPhone("095899772", "Oppo", "Android", 8, 128));
        h.SetPhone(Phone);

        System.out.println(h+" has "+h.getName().size()+" Smart Phone");
        int count = 0;
        for(int i = 0; i < h.getName().size(); i++) {
            SmartPhone s = h.getName().get(i);
            count++;
            System.out.println(count+". "+"Number: "+s);
        }
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
                    String phonenum = "";
                    for (int i = 0; i < h.getName().size(); i++) {
                        SmartPhone s = h.getName().get(i);
                        if (s.getNumber().equals(number)) {
                            countsearch++;
                            phonenum += s.getNumber()+" ";
                        } if(i == h.getName().size()-1) {
                            System.out.print("AAA has "+countsearch+" "+phonenum);
                            System.out.println();
                        } if(countsearch == 0 && i == h.getName().size()-1){
                            System.out.println("not found");
                        }
                    }
                    break;
                case 2:
                    System.out.print("Enter Brand: ");
                    String brand = input.next();
                    int countsearch2 = 0;
                    String brandnum = "";
                    for (int i = 0; i < h.getName().size(); i++) {
                        SmartPhone s = h.getName().get(i);
                        if (s.getBrand().equals(brand)) {
                            countsearch2++;
                            brandnum += s.getNumber()+" ";
                        }else if(i == h.getName().size()-1) {
                            System.out.print("AAA has "+countsearch2+" "+brandnum);
                            System.out.println();
                        }else if(countsearch2 == 0 && i == h.getName().size()-1){
                            System.out.println("not found");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter ROM: ");
                    int memory = input.nextInt();
                    int countsearch3 = 0;
                    String memorynum = "";
                    for (int i = 0; i < h.getName().size(); i++) {
                        SmartPhone s = h.getName().get(i);
                        if (s.getMemory() == memory) {
                            countsearch3++;
                            memorynum += s.getNumber()+" ";
                        } if(i == h.getName().size()-1) {
                            System.out.print("AAA has "+countsearch3+" "+memorynum);
                            System.out.println();
                        } if(countsearch3 == 0 && i == h.getName().size()-1){
                            System.out.println("not found");
                    }
                }
                    break;
                case 4:
                    System.out.print("Enter OS: ");
                    String os = input.next();
                    int countsearch4 = 0;
                    String osnum = "";
                    for (int i = 0; i < h.getName().size(); i++) {
                        SmartPhone s = h.getName().get(i);
                        if (s.getOs().equals(os)) {
                            countsearch4++;
                            osnum += s.getNumber()+" ";
                        }else if(i == h.getName().size()-1) {
                            System.out.print("AAA has "+countsearch4+" "+osnum);
                            System.out.println();
                        }else if(countsearch4 == 0 && i == h.getName().size()-1){
                            System.out.println("not found");
                        }
                            }
                    }
                    System.out.print("Continue?(y/n)");
                    yn = input.next().toLowerCase().charAt(0);
                    if(yn == 'n'){
                    System.out.println("Bye");
            }
            }
            
        }
    }

