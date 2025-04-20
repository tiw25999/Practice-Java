public class studenttest {
    public static void main(String[] args){
        student student1 = new student("65100001", "AAA", 'F', 20, 3.23);
        student student2 = new student("65100002", "BBB", 'M', 21, 3.02);
        student student3 = new student("65100003", "CCC", 'M', 19, 2.55);

        // Calculate average age
        int totalAge = student1.getAge() + student2.getAge() + student3.getAge();
        double averageAge = (double) totalAge / 3;

        // Calculate average GPAX
        double totalGPAX = student1.getGpax() + student2.getGpax() + student3.getGpax();
        double averageGPAX = totalGPAX / 3;

        System.out.println("Student Team");
        int i = 1;
            System.out.println(i+"."+student1.toString());
            System.out.println((i+1)+"."+student2.toString());
            System.out.println((i+2)+"."+student3.toString());
        
        System.out.print("Average Age: " + averageAge);
        System.out.printf(" Average GPAX: %.2f%n", averageGPAX);
    }
}