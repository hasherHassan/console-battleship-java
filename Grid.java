public class Grid
{
    private Location[][] grid;

    public static final int NUM_ROWS = 10;
    public static final int NUM_COLS = 10;

    public Grid()
    {
        grid = new Location[NUM_ROWS][NUM_COLS];
        for (int i = 0; i < NUM_ROWS; i++)
        {
            for (int j = 0; j < NUM_COLS; j++)
            {
                grid[i][j] = new Location();
            }
        }
    }

    public void markHit(int row, int col)
    {
        grid[row][col].markHit();
    }

    public void markMiss(int row, int col)
    {
        grid[row][col].markMiss();
    }

    public void setStatus(int row, int col, int status)
    {
        grid[row][col].setStatus(status);
    }

    // Prints only hits, misses, and empty spaces.
    public void printStatus()
    {
        for (int i = 0; i < NUM_COLS; i++)
        {
            System.out.print(" " + (i + 1));
        }
        System.out.println();

        for (int row = 0; row < NUM_ROWS; row++)
        {
            System.out.print((char)('A' + row));
            for (int col = 0; col < NUM_COLS; col++)
            {
                System.out.print(" ");
                if (grid[row][col].checkHit())
                {
                    System.out.print("X");
                }
                else if (grid[row][col].checkMiss())
                {
                    System.out.print("O");
                }
                else
                {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

    // Prints only where ships are located.
    public void printShips()
    {
        for (int i = 0; i < NUM_COLS; i++)
        {
            System.out.print(" " + (i + 1));
        }
        System.out.println();

        for (int row = 0; row < NUM_ROWS; row++)
        {
            System.out.print((char)('A' + row));
            for (int col = 0; col < NUM_COLS; col++)
            {
                System.out.print(" ");
                if (grid[row][col].hasShip())
                {
                    System.out.print("S");
                }
                else
                {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

    public boolean hasShip(int row, int col)
    {
        return grid[row][col].hasShip();
    }

    public int getStatus(int row, int col)
    {
        return grid[row][col].getStatus();
    }

    public boolean alreadyGuessed(int row, int col)
    {
        return !grid[row][col].isUnguessed();
    }

    public void setShip(int row, int col, boolean val)
    {
        grid[row][col].setShip(val);
    }

    public Location get(int row, int col)
    {
        return grid[row][col];
    }

    public int numRows()
    {
        return NUM_ROWS;
    }

    public int numCols()
    {
        return NUM_COLS;
    }

    public void addShip(Ship s)
    {
        if (s.getDirection() == 0)
        {
            for (int i = 0; i < s.getLength(); i++)
            {
                setShip(s.getRow(), s.getCol() + i, true);
            }
        }
        else if (s.getDirection() == 1)
        {
            for (int i = 0; i < s.getLength(); i++)
            {
                setShip(s.getRow() + i, s.getCol(), true);
            }
        }
    }
}
