import java.util.ArrayList;
import java.util.Scanner;

public class login2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <Student1> s1 = new ArrayList <Student1>();
        s1.add(new Student1("AAA", "65100000", new Login("SD0010", "Sd5648**")));
        s1.add(new Student1("BBB", "65110000", new Login("SD0011", "Sd0001**")));
        s1.add(new Student1("CCC", "65120000", new Login("SD0012", "Sd0002**")));
        ArrayList <Student1> s2 = new ArrayList <Student1>();
        s2.add(new Student1("DDD", "65130000", new Login ("SD0013", "Sd0003**")));
        s2.add(new Student1("FFF", "65130011", new Login ("SD0100", "Sd5648#55**")));
        ArrayList <Major> Majors = new ArrayList <Major>();
        Majors.add(new Major("Major COE: ",s1));
        Majors.add(new Major("Major CPE:",s2));

        for(int i = 0; i < Majors.size(); i++){
            System.out.println(Majors.get(i).getName());
            for(int j = 0; j < Majors.get(i).getStudent().size(); j++){
                System.out.println(Majors.get(i).getStudent().get(j).toString());
            }
        }

        char yn = 'y';

        while (yn == 'y') {
            System.out.println("Welcome to login verification => Change Password Menu");
            System.out.println("Enter ID: ");
            String id = input.nextLine();
            for(int i = 0; i < Majors.size(); i++){
                if(Majors.get(i).getStudent().size() != 0){
                    for(int j = 0; j < Majors.get(i).getStudent().size(); j++){
                        if(Majors.get(i).getStudent().get(j).getID().equals(id)){
                            Majors.remove(i);
                            System.out.println("Complete!");
                            }
                            }

                            
                        }
                    }
                }
            
            System.out.println("Do you want to continue? y/n");
            yn = input.nextLine().charAt(0);
        }
        


    
    }

