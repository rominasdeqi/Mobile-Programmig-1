import java.util.Scanner;

public class SubscriptionCost {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter total subscription cost: ");
        String costInput = input.nextLine();

        System.out.print("Enter number of people: ");
        String peopleInput = input.nextLine();

        try {

            double totalCost = Double.parseDouble(costInput);
            int people = Integer.parseInt(peopleInput);

            if (totalCost < 0) {
                System.out.println("Cost cannot be negative.");
            }
            else if (people < 0) {
                System.out.println("Number of people cannot be negative.");
            }
            else if (people == 0) {
                System.out.println("Number of people cannot be zero.");
            }
            else {
                double share = totalCost / people;

                System.out.println("Share per person: " + share);
            }

        }
        catch (NumberFormatException e) {

            System.out.println("Invalid input.");

        }

        input.close();
    }
}