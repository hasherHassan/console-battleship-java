public class Player
{
    private static final int[] SHIP_LENGTHS = {2, 3, 4, 5};

    private Grid player;
    private Grid bot;
    private int count;

    public Player()
    {
        player = new Grid();
        bot = new Grid();
        count = 0;
    }

    public void chooseShipLocation(Ship s, int row, int col, int direction)
    {
        s.setLocation(row, col);
        s.setDirection(direction);
        player.addShip(s);
        count++;
    }

    public void printMyShips()
    {
        player.printShips();
    }

    public void printOpponentGuesses()
    {
        player.printStatus();
    }

    public void printMyGuesses()
    {
        bot.printStatus();
    }

    public boolean recordOpponentGuess(int row, int col)
    {
        if (player.hasShip(row, col))
        {
            player.markHit(row, col);
            return true;
        }
        else
        {
            player.markMiss(row, col);
            return false;
        }
    }
}
