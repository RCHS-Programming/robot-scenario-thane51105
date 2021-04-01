import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    private GreenfootImage robotimage1= new GreenfootImage("man01.png");
    private GreenfootImage robotimage2= new GreenfootImage("man02.png");
    private int timeToSwitchImages=0;
    private int Lives=3;
    private int Score=0;
    private int pizzaEaten=0;
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
        detectHome();
        eatPizza();
    }    
    
    public void robotMovement()
    {
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation( getX(), getY() -3);
            animate();
        }
        
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation( getX(), getY() +3);
            animate();
        }
        
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation( getX() -3, getY() );
            animate();
        }
        
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation( getX() +3, getY() );
            animate();
        }
    }
    
    public void detectWallCollision()
    {
        if (isTouching(Wall.class))
        {
            setLocation( 20, 30 );
            Greenfoot.playSound ("hurt.wav");
        }
    }
    
    public void detectBlockCollision()
    {
        if (isTouching(Block.class))
        {
            setLocation( 20, 30 );
            Greenfoot.playSound ("hurt.wav");
        }
    }
    
    public void detectHome()
    {
        if (isTouching(Home.class))
        {
            setLocation( 20, 30 );
            Greenfoot.playSound ("yipee.wav");
            if(pizzaEaten ==5)
            {
                Greenfoot.stop();
            }
        }
    }
    
    public void eatPizza()
    {
        if (isTouching(Pizza.class))
        {
            Greenfoot.playSound("eat.wav");
            removeTouching(Pizza.class);
            pizzaEaten = pizzaEaten + 1;
        }
    }
    
    public void animate()
    {
        if(timeToSwitchImages>=3)
        {
            if(getImage() == robotimage1)
                setImage (robotimage2);
        
            else
        
            setImage (robotimage1);
            timeToSwitchImages = 0;
        }
        else
            timeToSwitchImages++;
        }
        }
    

