import java.util.Scanner;

public class NotificationSettings {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean notificationsEnabled = true;
        int choice;

        System.out.println("===== Notification Settings =====");
        System.out.println("1. Enable Notifications");
        System.out.println("2. Disable Notifications");
        System.out.println("3. View Notification Status");
        System.out.println("4. Restore Default Settings");

        System.out.print("Enter your choice (1-4): ");
        choice = input.nextInt();

        switch (choice) {

            case 1:
                notificationsEnabled = true;
                System.out.println("Notifications enabled.");
                break;

            case 2:
                notificationsEnabled = false;
                System.out.println("Notifications disabled.");
                break;

            case 3:
                if (notificationsEnabled == true) {
                    System.out.println("Notification status: Enabled");
                } else {
                    System.out.println("Notification status: Disabled");
                }
                break;

            case 4:
                notificationsEnabled = true;
                System.out.println("Default settings restored.");
                break;

            default:
                System.out.println("Invalid option.");
                break;
        }

        input.close();
    }
}