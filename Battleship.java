import java.util.*;
import acm.program.ConsoleProgram;

public class Battleship extends ConsoleProgram
{
    private Player player;
    private Player enemy;

    public static final int NUM_ROWS = 10;
    public static final int NUM_COLS = 10;

    public Battleship()
    {
        player = new Player();
        enemy = new Player();
    }

    public void run()
    {
        Scanner scanner = new Scanner(System.in);

        // Player places ships
        System.out.println("Player, place your ships.");

        for (int i = 0; i < 5; i++)
        {
            System.out.println("What length would you like to choose: ");
            int length = scanner.nextInt();
            Ship ship = new Ship(length);

            System.out.println("What row would you like to choose: ");
            int row = scanner.nextInt();
            System.out.println("What column would you like to choose: ");
            int col = scanner.nextInt();
            System.out.println("What direction would you like to choose? (0 = horizontal, 1 = vertical)");
            int direction = scanner.nextInt();

            player.chooseShipLocation(ship, row, col, direction);
        }

        System.out.println();
        System.out.println("Enemy, place your ships.");

        for (int i = 0; i < 5; i++)
        {
            System.out.println("What length would you like to choose: ");
            int length = scanner.nextInt();
            Ship ship = new Ship(length);

            System.out.println("What row would you like to choose: ");
            int row = scanner.nextInt();
            System.out.println("What column would you like to choose: ");
            int col = scanner.nextInt();
            System.out.println("What direction would you like to choose? (0 = horizontal, 1 = vertical)");
            int direction = scanner.nextInt();

            enemy.chooseShipLocation(ship, row, col, direction);
        }

        System.out.println();
        System.out.println("Player's Ships: ");
        player.printMyShips();

        System.out.println();
        System.out.println("Enemy's Ships: ");
        enemy.printMyShips();

        // Play 5 rounds
        for (int i = 0; i < 5; i++)
        {
            System.out.println();
            System.out.println("Round " + (i + 1));
            askForGuess();

            System.out.println();
            System.out.println("Player's current board: ");
            player.printMyShips();
            player.printOpponentGuesses();

            System.out.println();
            System.out.println("Enemy's current board: ");
            enemy.printMyShips();
            enemy.printOpponentGuesses();
        }
    }

    public void askForGuess()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Player's guess");
        System.out.println("What row would you like to choose: ");
        int row = scanner.nextInt();
        System.out.println("What column would you like to choose: ");
        int column = scanner.nextInt();

        if (enemy.recordOpponentGuess(row, column))
        {
            System.out.println("You hit the enemy!");
        }
        else
        {
            System.out.println("You missed the enemy!");
        }

        System.out.println();
        System.out.println("Enemy's guess");
        System.out.println("What row would you like to choose: ");
        int r = scanner.nextInt();
        System.out.println("What column would you like to choose: ");
        int c = scanner.nextInt();

        if (player.recordOpponentGuess(r, c))
        {
            System.out.println("Enemy hit you!");
        }
        else
        {
            System.out.println("Enemy missed you!");
        }
    }
}
