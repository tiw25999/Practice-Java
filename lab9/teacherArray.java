public class teacherArray {
    public static void main(String[] args){
        teacher[] teachers = new teacher[5];
        teachers[0] = new teacher("AAA", 'F', 40);
        teachers[1] = new teacher("BBB", 'M', 51);
        teachers[2] = new teacher("CCC", 'M', 39);
        teachers[3] = new teacher("DDD", 'F', 45);
        teachers[4] = new teacher("FFF", 'F', 31);
        int mCount = 0, fCount = 0;
        int max = 0;
        int min = 99999;
        System.out.println("Teacher Team: 5 Peerson");
        for(int i = 0 ;i < 5;i++ ){
            System.out.println((i+1)+"."+teachers[i].toString());
            if (teachers[i].getGender() == 'F') {
                fCount++;
            } else if (teachers[i].getGender() == 'M') {
                mCount++;
            }
        }
        
        for(int i = 0; i < 5; i++){
            
            if(teachers[i].getAge() > max){
                max = teachers[i].getAge();
            }
            else if(teachers[i].getAge() < min){
                min = teachers[i].getAge();
            }
        }
        System.out.println("No.of Female: "+fCount+" "+"No. of Male: "+mCount);
        System.out.println("Average: "+(teachers[0].getAge()+teachers[1].getAge()+teachers[2].getAge()+teachers[3].getAge()+teachers[4].getAge())/5);
        System.out.println("Min: "+min+" Max: "+max);
        }
        
        
       
    }
