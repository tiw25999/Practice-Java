public class SMS01 {
    public static void main(String[] args) {
        Sms id = new Sms("4888051");
        Sms id2 = new Sms("494999");
        Sms id3 = new Sms("4888051");
        
        System.out.println("Sms number: "+id.toString());
        id.readAs();
        System.out.println();
        System.out.println("Sms number: "+id2.toString());
        id2.readAs();
        System.out.println();
        System.out.println("Sms number: "+id3.toString());
        id3.readAs();
        System.out.println();
        System.out.println("======================================================");

        if (id.getNumber().equals(id2.getNumber())) {
            System.out.println("Sms number 1 is equal to Sms number 2");
        } else {
            System.out.println("Sms number 1 is not equal to Sms number 2");
        }

        if (id.getNumber().equals(id3.getNumber())) {
            System.out.println("Sms number 1 is equal to Sms number 3");
        } else {
            System.out.println("Sms number 1 is not equal to Sms number 3");
        }

        if (id2.getNumber().equals(id3.getNumber())) {
            System.out.println("Sms number 2 is equal to Sms number 3");
        } else {
            System.out.println("Sms number 2 is not equal to Sms number 3");
        }
    }
}



