public class Ship
{
    private int row;
    private int col;
    private int length;
    private int direction;

    private static final int UNSET = -1;
    private static final int HORIZONTAL = 0;
    private static final int VERTICAL = 1;

    public Ship(int length)
    {
        this.length = length;
        row = UNSET;
        col = UNSET;
        direction = UNSET;
    }

    public boolean isLocationSet()
    {
        return row != UNSET && col != UNSET;
    }

    public boolean isDirectionSet()
    {
        return direction != UNSET;
    }

    public void setLocation(int row, int col)
    {
        this.row = row;
        this.col = col;
    }

    public void setDirection(int direction)
    {
        this.direction = direction;
    }

    public int getRow()
    {
        return row;
    }

    public int getCol()
    {
        return col;
    }

    public int getLength()
    {
        return length;
    }

    public int getDirection()
    {
        return direction;
    }

    private String directionToString()
    {
        return "" + direction;
    }

    private String locationToString()
    {
        return "(" + getRow() + ", " + getCol() + ")";
    }

    public String toString()
    {
        if (getRow() == UNSET)
        {
            return "unset direction ship of length "
                    + getLength()
                    + " at (unset location)";
        }
        else
        {
            if (getDirection() == HORIZONTAL)
            {
                return "horizontal ship of length "
                        + getLength()
                        + " at "
                        + locationToString();
            }
            else
            {
                return "vertical ship of length "
                        + getLength()
                        + " at "
                        + locationToString();
            }
        }
    }
}
