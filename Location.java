public class Location
{
    public static final int UNGUESSED = 0;
    public static final int HIT = 1;
    public static final int MISSED = 2;

    private boolean hasShip;
    private int status;

    public Location()
    {
        status = UNGUESSED;
        hasShip = false;
    }

    public boolean checkHit()
    {
        return status == HIT;
    }

    public boolean checkMiss()
    {
        return status == MISSED;
    }

    public boolean isUnguessed()
    {
        return status == UNGUESSED;
    }

    public void markHit()
    {
        status = HIT;
    }

    public void markMiss()
    {
        status = MISSED;
    }

    public boolean hasShip()
    {
        return hasShip;
    }

    public void setShip(boolean val)
    {
        hasShip = val;
    }

    public void setStatus(int status)
    {
        this.status = status;
    }

    public int getStatus()
    {
        return status;
    }
}
