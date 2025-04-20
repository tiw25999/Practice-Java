package test;
public class test {
    public static void main(String[] args) {
        int x = 9;
        if(x > 0){
            if(x%2 == 0){
                System.out.println(x);
            }else{
                x = x+1;
                System.out.println(x);
            }
            }else if(x < 0){
                if(x%2 == 0){
                    System.out.println(x);
                }else{
                    x = x-1;
                    System.out.println(x);
                }
            } else{
                System.out.println(x);
            }
        }
    }

