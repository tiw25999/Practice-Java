public class loop15 {
    public static void main(String[] args){
        int i = 1,count = 0;
        int number = 28;
        do{
        if(i <= 25){
            System.out.printf("%8d",i);
            count++; i++;
            if(count == 5){
                System.out.println("");
                count = 0;}
            }
        }while(i <= number);
}
}