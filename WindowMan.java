import kareltherobot.*;

/**
 * Write a description of class MazeWalker here.
 * 
 * @author Rasheen Farlow 
 * @version 15-10-26
 */
public class WindowMan extends Robot implements Directions, WindowSealer
{
    /**
     * Constructor for objects of class MazeWalker
     */
    public WindowMan(int st, int ave, Direction dir, int beeps)
    {
        super(st, ave, dir, beeps);
    }

    public void moveToNextWindow()
    { 
        while(frontIsClear() && !leftIsClear())

        { 
            move();
        }
        if(!frontIsClear())
        {
            turnRight();
        }
    }
    //interface method   
    public void sealWindow()
    {
    }

    public void closeWindow()
    {
        if(leftIsClear())
        {

            putBeeper();
            move();

        }
    }
    public void work() 
    {
        putBeeper();
        move();
        while(!nextToABeeper())

        {
            moveToNextWindow();
            closeWindow();
        }

        pickBeeper();
    }

    public boolean leftIsClear(){
        boolean result = false;
        turnLeft();
        if(frontIsClear())
        {
            result = true;
        }
        turnRight();
        return result;
    }

     
    private void turnRight()
    { 
        turnLeft(); turnLeft(); turnLeft();

    }

}

