import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RobotWorld here.
 * 
 * @author Thane Hudelson 
 * @version (a version number or a date)
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class RobotWorld.
     * 
     */
    public RobotWorld()
    {    
        super(800, 600, 1); 
        addObject(new Robot(), 45, 30);
        addObject(new Wall(), 60, 150);
        addObject(new Wall(), 160, 150);
        addObject(new Wall(), 260, 150);
        addObject(new Block(), 415, 155);
        addObject(new Wall(), 570, 150);
        addObject(new Wall(), 670, 150);
        addObject(new Wall(), 770, 150);
        addObject(new Home(), 770, 560);
        addObject(new ScorePanel(), 70, 560);
        addObject( new Pizza(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(80));
        addObject( new Pizza(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(80));
        addObject( new Pizza(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600) + 200);
        addObject( new Pizza(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600) + 200);
        addObject( new Pizza(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600) + 200);
    }
}
