import java.util.Scanner;

public class InternetPackage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String volumeInput;
        String walletInput;

        double volume;
        double wallet;
        double price;
        double discount;
        double finalPrice;
        double remaining;
        double shortage;

        System.out.print("Enter internet package volume (GB): ");
        volumeInput = input.nextLine();

        System.out.print("Enter wallet balance (Toman): ");
        walletInput = input.nextLine();

        try {

            volume = Double.parseDouble(volumeInput);
            wallet = Double.parseDouble(walletInput);

            if (volume <= 0 || wallet < 0) {

                System.out.println("Invalid package volume or wallet balance.");

            } else {

                price = volume * 5000;

                if (volume > 10) {
                    discount = price * 0.15;
                } else {
                    discount = 0;
                }

                finalPrice = price - discount;

                if (wallet >= finalPrice) {

                    remaining = wallet - finalPrice;

                    System.out.println("Purchase completed successfully.");
                    System.out.println("Remaining balance: " + remaining + " Toman");

                } else {

                    shortage = finalPrice - wallet;

                    System.out.println("Insufficient wallet balance.");
                    System.out.println("Shortage amount: " + shortage + " Toman");

                }
            }

        } catch (NumberFormatException e) {

            System.out.println("Invalid input! Please enter numeric values.");

        }

        input.close();
    }
}