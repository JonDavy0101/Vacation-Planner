import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nHello! I am your trip planner. To help you plan your");
        System.out.println("next vacation I need some information about you.");

        System.out.print("\nWhat is your name: ");
        String name = input.nextLine();
        System.out.print("Hello " + name + ". Where would you like to travel: ");
        String place = input.nextLine();
        System.out.print("How many days would you like to spend in " + place + ": ");
        int length = input.nextInt();
        System.out.print("What is the maximum amount of money you would like to spend: ");
        int budget = input.nextInt();
    }
}
