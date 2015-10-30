import kareltherobot.*;
/**
 * driver class MazeDrive - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public class WindowDrive implements Directions
{
    public static void main(String[] args)
    {
        World.reset();
        World.setDelay(1);
        World.readWorld("windowWorld.kwld");
        World.setTrace(true);
        World.setVisible(true);
        
        WindowMan walk1 = new WindowMan(7, 5, East,infinity);
        walk1.work();
    }
}