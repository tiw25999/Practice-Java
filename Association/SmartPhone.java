package Association;

public class SmartPhone {
    private String number;
    private String brand;
    private String os;
    private int ram;
    private int rom;

    public SmartPhone() {
        
    }

    public SmartPhone(String number, String brand, String os, int ram, int rom) {
        this.number = number;
        this.brand = brand;
        this.os = os;
        this.ram = ram;
        this.rom = rom;
    }

    public String getNumber() {
        return number;
    }

    public String getBrand() {
        return brand;
    }

    public String getOs() {
        return os;
    }

    public int getRam() {
        return ram;
    }

    public int getMemory() {
        return rom;
    }

    public String toString() {
        return number + ", " +"Brand "+ brand + ", " +"OS "+ os + ", " +"RAM "+ ram +" GB"+ ", " +"ROM "+ rom+" GB";
    }
}
