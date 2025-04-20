import java.util.HashMap;
import java.util.Scanner;

public class UserManagement {
    private HashMap<String, String> users = new HashMap<String, String>();

    public void register() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = input.nextLine();
        System.out.print("Enter your password: ");
        String password = input.nextLine();
        users.put(username, password);
        System.out.println("Registration successful!");
    }

    public void login() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = input.nextLine();
        System.out.print("Enter your password: ");
        String password = input.nextLine();
        if (users.containsKey(username) && users.get(username).equals(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    public static void main(String[] args) {
        UserManagement userManagement = new UserManagement();
        userManagement.register();
        userManagement.login();
    }
}
