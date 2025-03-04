import java.util.Random;
import java.util.Scanner;
public class Part_C_Die_Roller
{

    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            // Print header
            System.out.println("Roll Die1 Die2 Die3 Sum");
            System.out.println("----------------------------------------");

            int rollCount = 0;
            boolean hasTriple = false;

            // Roll until triple is found
            while (!hasTriple) {
                rollCount++;

                // Generate 3 random die values (1-6)
                int die1 = random.nextInt(6) + 1;
                int die2 = random.nextInt(6) + 1;
                int die3 = random.nextInt(6) + 1;

                // Calculate sum
                int sum = die1 + die2 + die3;

                // Print the roll information
                System.out.printf("%-6d%-6d%-6d%-6d%-6d%n", rollCount, die1, die2, die3, sum);

                // Check for triple
                if (die1 == die2 && die2 == die3) {
                    hasTriple = true;
                    System.out.println("\nYou got a triple!");
                    }
                }

            // Ask if the user wants to continue
            System.out.print("\nDo you want to roll again? (y/n): ");
            choice = scanner.nextLine();
            }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
