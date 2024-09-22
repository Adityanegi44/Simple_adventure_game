import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {
        // Create a Scanner object for reading player input
        Scanner scanner = new Scanner(System.in);
        String playerChoice = "";  // Stores the player's input
        boolean gameRunning = true;  // Controls the game loop
        boolean hasTreasure = false; // Whether the player has found the treasure

        // Introduction to the game
        System.out.println("Welcome to the Adventure Game!");
        System.out.println("You find yourself in a dark room with three doors: North, East, and West.");
        System.out.println("What will you do?");

        // Main game loop
        while (gameRunning) {
            System.out.print("\n> ");  // Prompt for player input
            playerChoice = scanner.nextLine().toLowerCase();  // Read input and convert it to lowercase

            switch (playerChoice) {
                case "north":
                    System.out.println("You head north and find a treasure chest!");
                    hasTreasure = true;
                    break;

                case "east":
                    System.out.println("You walk east and fall into a pit. Game over.");
                    gameRunning = false;  // End the game
                    break;

                case "west":
                    if (hasTreasure) {
                        System.out.println("You walk west and find the exit. You win!");
                        gameRunning = false;  // End the game
                    } else {
                        System.out.println("The west door is locked. Maybe you need something to unlock it.");
                    }
                    break;

                case "quit":
                    System.out.println("You quit the game.");
                    gameRunning = false;  // End the game
                    break;

                default:
                    System.out.println("I don't understand that command.");
                    System.out.println("Try using commands like 'north', 'east', 'west', or 'quit'.");
            }
        }

        // Closing message after the game ends
        System.out.println("Thanks for playing!");
        scanner.close();  // Close the scanner
    }
}
